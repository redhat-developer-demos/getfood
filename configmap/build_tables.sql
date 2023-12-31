CREATE TABLE IF NOT EXISTS food (
	food_code int,
	display_name vaRcHaR( 80 ),
	portion_default int,
	portion_amount numeric,
	portion_display_name vaRcHaR( 40 ),
	factor numeric,
	increment numeric,
	multiplier numeric,
	grains numeric,
	whole_grains numeric,
	vegetables numeric,
	orange_vegetables numeric,
	drkgreen_vegetables numeric,
	starchy_vegetables numeric,
	other_vegetables numeric,
	fruits numeric,
	milk numeric,
	meats numeric,
	soy numeric,
	drybeans_peas numeric,
	oils numeric,
	solid_fats numeric,
	added_sugars numeric,
	alcohol numeric,
	calories numeric,
	saturated_fats numeric
);