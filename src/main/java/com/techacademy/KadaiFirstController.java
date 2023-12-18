package com.techacademy;

import java.time.DayOfWeek;
import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {

	// 仕様１
	@GetMapping("/dayofweek/{yyyymmdd}")
	public String dispDayOfWeek(@PathVariable String yyyymmdd) {
		String yyyy = yyyymmdd.substring(0, 4);
		String mm = yyyymmdd.substring(4, 6);
		String dd = yyyymmdd.substring(6, 8);
		LocalDate ld = LocalDate.of(Integer.parseInt(yyyy), Integer.parseInt(mm), Integer.parseInt(dd));
		DayOfWeek w = ld.getDayOfWeek();
		return "" + w;

	}

	// 仕様２
	@GetMapping("/plus/{val1}/{val2}")
	public String calcPlus(@PathVariable int val1, @PathVariable int val2) {
		int res = 0;
		res = val1 + val2;
		return "足し算:" + res;
	}

	@GetMapping("/minus/{val1}/{val2}")
	public String calcMinus(@PathVariable int val1, @PathVariable int val2) {
		int res = 0;
		res = val1 - val2;
		return "引き算:" + res;
	}

	@GetMapping("/times/{val1}/{val2}")
	public String calcTimes(@PathVariable int val1, @PathVariable int val2) {
		int res = 0;
		res = val1 * val2;
		return "掛け算:" + res;
	}

	@GetMapping("/divide/{val1}/{val2}")
	public String calcDivide(@PathVariable int val1, @PathVariable int val2) {
		int res = 0;
		res = val1 / val2;
		return "割り算:" + res;
	}
}
