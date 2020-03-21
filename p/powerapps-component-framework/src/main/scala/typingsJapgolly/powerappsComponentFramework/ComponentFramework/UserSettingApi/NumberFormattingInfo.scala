package typingsJapgolly.powerappsComponentFramework.ComponentFramework.UserSettingApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The interface for the Org System Settings Number Format Info exposed to a custom control
		 * Comments indicate example values
		 */
trait NumberFormattingInfo extends js.Object {
  /**
  			 * @example 2
  			 */
  var currencyDecimalDigits: Double
  /**
  			 * @example "."
  			 */
  var currencyDecimalSeparator: String
  /**
  			 * @example ","
  			 */
  var currencyGroupSeparator: String
  /**
  			 * @example [ 3 ]
  			 */
  var currencyGroupSizes: js.Array[Double]
  /**
  			 * @example 0
  			 */
  var currencyNegativePattern: Double
  /**
  			 * @example 0
  			 */
  var currencyPositivePattern: Double
  /**
  			 * @example "$"
  			 */
  var currencySymbol: String
  /**
  			 * @example "NaN"
  			 */
  var nanSymbol: String
  /**
  			 * @example { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}
  			 */
  var nativeDigits: js.Array[String]
  /**
  			 * @example "-Infinity"
  			 */
  var negativeInfinitySymbol: String
  /**
  			 * @example "-"
  			 */
  var negativeSign: String
  /**
  			 * @example 2
  			 */
  var numberDecimalDigits: Double
  /**
  			 * @example "."
  			 */
  var numberDecimalSeparator: String
  /**
  			 * @example ","
  			 */
  var numberGroupSeparator: String
  /**
  			 * @example [3]
  			 */
  var numberGroupSizes: js.Array[Double]
  /**
  			 * @example 1
  			 */
  var numberNegativePattern: Double
  /**
  			 * @example ""
  			 */
  var perMilleSymbol: String
  /**
  			 * @example 2
  			 */
  var percentDecimalDigits: Double
  /**
  			 * @example "."
  			 */
  var percentDecimalSeparator: String
  /**
  			 * @example ","
  			 */
  var percentGroupSeparator: String
  /**
  			 * @example [3]
  			 */
  var percentGroupSizes: js.Array[Double]
  /**
  			 * @example 0
  			 */
  var percentNegativePattern: Double
  /**
  			 * @example 0
  			 */
  var percentPositivePattern: Double
  /**
  			 * @example "%"
  			 */
  var percentSymbol: String
  /**
  			 * @example "Infinity"
  			 */
  var positiveInfinitySymbol: String
  /**
  			 * @example "+"
  			 */
  var positiveSign: String
}

object NumberFormattingInfo {
  @scala.inline
  def apply(
    currencyDecimalDigits: Double,
    currencyDecimalSeparator: String,
    currencyGroupSeparator: String,
    currencyGroupSizes: js.Array[Double],
    currencyNegativePattern: Double,
    currencyPositivePattern: Double,
    currencySymbol: String,
    nanSymbol: String,
    nativeDigits: js.Array[String],
    negativeInfinitySymbol: String,
    negativeSign: String,
    numberDecimalDigits: Double,
    numberDecimalSeparator: String,
    numberGroupSeparator: String,
    numberGroupSizes: js.Array[Double],
    numberNegativePattern: Double,
    perMilleSymbol: String,
    percentDecimalDigits: Double,
    percentDecimalSeparator: String,
    percentGroupSeparator: String,
    percentGroupSizes: js.Array[Double],
    percentNegativePattern: Double,
    percentPositivePattern: Double,
    percentSymbol: String,
    positiveInfinitySymbol: String,
    positiveSign: String
  ): NumberFormattingInfo = {
    val __obj = js.Dynamic.literal(currencyDecimalDigits = currencyDecimalDigits.asInstanceOf[js.Any], currencyDecimalSeparator = currencyDecimalSeparator.asInstanceOf[js.Any], currencyGroupSeparator = currencyGroupSeparator.asInstanceOf[js.Any], currencyGroupSizes = currencyGroupSizes.asInstanceOf[js.Any], currencyNegativePattern = currencyNegativePattern.asInstanceOf[js.Any], currencyPositivePattern = currencyPositivePattern.asInstanceOf[js.Any], currencySymbol = currencySymbol.asInstanceOf[js.Any], nanSymbol = nanSymbol.asInstanceOf[js.Any], nativeDigits = nativeDigits.asInstanceOf[js.Any], negativeInfinitySymbol = negativeInfinitySymbol.asInstanceOf[js.Any], negativeSign = negativeSign.asInstanceOf[js.Any], numberDecimalDigits = numberDecimalDigits.asInstanceOf[js.Any], numberDecimalSeparator = numberDecimalSeparator.asInstanceOf[js.Any], numberGroupSeparator = numberGroupSeparator.asInstanceOf[js.Any], numberGroupSizes = numberGroupSizes.asInstanceOf[js.Any], numberNegativePattern = numberNegativePattern.asInstanceOf[js.Any], perMilleSymbol = perMilleSymbol.asInstanceOf[js.Any], percentDecimalDigits = percentDecimalDigits.asInstanceOf[js.Any], percentDecimalSeparator = percentDecimalSeparator.asInstanceOf[js.Any], percentGroupSeparator = percentGroupSeparator.asInstanceOf[js.Any], percentGroupSizes = percentGroupSizes.asInstanceOf[js.Any], percentNegativePattern = percentNegativePattern.asInstanceOf[js.Any], percentPositivePattern = percentPositivePattern.asInstanceOf[js.Any], percentSymbol = percentSymbol.asInstanceOf[js.Any], positiveInfinitySymbol = positiveInfinitySymbol.asInstanceOf[js.Any], positiveSign = positiveSign.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NumberFormattingInfo]
  }
}

