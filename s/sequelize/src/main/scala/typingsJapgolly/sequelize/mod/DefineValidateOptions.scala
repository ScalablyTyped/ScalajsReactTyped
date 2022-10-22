package typingsJapgolly.sequelize.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.sequelize.anon.Args
import typingsJapgolly.sequelize.anon.ArgsBoolean
import typingsJapgolly.sequelize.anon.ArgsMsg
import typingsJapgolly.sequelize.anon.ArgsMsgString
import typingsJapgolly.sequelize.anon.ArgsNumber
import typingsJapgolly.sequelize.anon.ArgsString
import typingsJapgolly.sequelize.anon.MsgString
import typingsJapgolly.sequelize.anon.`1`
import typingsJapgolly.sequelize.sequelizeInts.`3`
import typingsJapgolly.sequelize.sequelizeInts.`4`
import typingsJapgolly.sequelize.sequelizeInts.`5`
import typingsJapgolly.sequelize.sequelizeStrings.all
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Model validations, allow you to specify format/content/inheritance validations for each attribute of the
  * model.
  *
  * Validations are automatically run on create, update and save. You can also call validate() to manually
  * validate an instance.
  *
  * The validations are implemented by validator.js.
  */
trait DefineValidateOptions
  extends StObject
     with /**
  * custom validations are also possible
  *
  * Implementation notes :
  *
  * We can't enforce any other method to be a function, so :
  *
  * ```typescript
  * [name: string] : ( value : any ) => boolean;
  * ```
  *
  * doesn't work in combination with the properties above
  *
  * @see https://github.com/Microsoft/TypeScript/issues/1889
  */
/* name */ StringDictionary[Any] {
  
  /**
    * force specific substrings
    */
  var contains: js.UndefOr[String | MsgString] = js.undefined
  
  /**
    * only allow a specific value
    */
  @JSName("equals")
  var equals_FDefineValidateOptions: js.UndefOr[String | MsgString] = js.undefined
  
  /**
    * is: ["^[a-z]+$",'i'] // will only allow letters
    * is: /^[a-z]+$/i      // same as the previous example using real RegExp
    */
  var is: js.UndefOr[String | (js.Array[String | js.RegExp]) | js.RegExp | Args] = js.undefined
  
  /**
    * only allow date strings after a specific date
    */
  var isAfter: js.UndefOr[String | ArgsString] = js.undefined
  
  /**
    * will only allow letters
    */
  var isAlpha: js.UndefOr[Boolean | MsgString] = js.undefined
  
  /**
    * will only allow alphanumeric characters, so "_abc" will fail
    */
  var isAlphanumeric: js.UndefOr[Boolean | MsgString] = js.undefined
  
  /**
    * only allow arrays
    */
  var isArray: js.UndefOr[Boolean | ArgsBoolean] = js.undefined
  
  /**
    * only allow date strings before a specific date
    */
  var isBefore: js.UndefOr[String | ArgsString] = js.undefined
  
  /**
    * check for valid credit card numbers
    */
  var isCreditCard: js.UndefOr[Boolean | ArgsBoolean] = js.undefined
  
  /**
    * only allow date strings
    */
  var isDate: js.UndefOr[Boolean | ArgsBoolean] = js.undefined
  
  /**
    * checks for any numbers
    */
  var isDecimal: js.UndefOr[Boolean | MsgString] = js.undefined
  
  /**
    * checks for email format (foo@bar.com)
    */
  var isEmail: js.UndefOr[Boolean | MsgString] = js.undefined
  
  /**
    * checks for valid floating point numbers
    */
  var isFloat: js.UndefOr[Boolean | MsgString] = js.undefined
  
  /**
    * checks for IPv4 (129.89.23.1) or IPv6 format
    */
  var isIP: js.UndefOr[Boolean | MsgString] = js.undefined
  
  /**
    * checks for IPv4 (129.89.23.1)
    */
  var isIPv4: js.UndefOr[Boolean | MsgString] = js.undefined
  
  /**
    * checks for IPv6 format
    */
  var isIPv6: js.UndefOr[Boolean | MsgString] = js.undefined
  
  /**
    * check the value is one of these
    */
  var isIn: js.UndefOr[js.Array[js.Array[String]] | ArgsMsg] = js.undefined
  
  /**
    * checks for valid integers
    */
  var isInt: js.UndefOr[Boolean | MsgString] = js.undefined
  
  /**
    * checks for lowercase
    */
  var isLowercase: js.UndefOr[Boolean | MsgString] = js.undefined
  
  /**
    * only allows null
    */
  var isNull: js.UndefOr[Boolean | MsgString] = js.undefined
  
  /**
    * will only allow numbers
    */
  var isNumeric: js.UndefOr[Boolean | MsgString] = js.undefined
  
  /**
    * only allow uuids
    */
  var isUUID: js.UndefOr[
    `3` | `4` | `5` | typingsJapgolly.sequelize.sequelizeStrings.`3` | typingsJapgolly.sequelize.sequelizeStrings.`4` | typingsJapgolly.sequelize.sequelizeStrings.`5` | all | ArgsNumber
  ] = js.undefined
  
  /**
    * checks for uppercase
    */
  var isUppercase: js.UndefOr[Boolean | MsgString] = js.undefined
  
  /**
    * checks for url format (http://foo.com)
    */
  var isUrl: js.UndefOr[Boolean | MsgString] = js.undefined
  
  /**
    * only allow values with length between 2 and 10
    */
  var len: js.UndefOr[(js.Tuple2[Double, Double]) | `1`] = js.undefined
  
  /**
    * only allow values
    */
  var max: js.UndefOr[Double | ArgsNumber] = js.undefined
  
  /**
    * only allow values >= 23
    */
  var min: js.UndefOr[Double | ArgsNumber] = js.undefined
  
  /**
    * not: ["[a-z]",'i']  // will not allow letters
    */
  var not: js.UndefOr[String | (js.Array[String | js.RegExp]) | js.RegExp | Args] = js.undefined
  
  /**
    * don't allow specific substrings
    */
  var notContains: js.UndefOr[js.Array[String] | String | ArgsMsgString] = js.undefined
  
  /**
    * don't allow empty strings
    */
  var notEmpty: js.UndefOr[Boolean | MsgString] = js.undefined
  
  /**
    * check the value is not one of these
    */
  var notIn: js.UndefOr[js.Array[js.Array[String]] | ArgsMsg] = js.undefined
  
  /**
    * won't allow null
    */
  var notNull: js.UndefOr[Boolean | MsgString] = js.undefined
}
object DefineValidateOptions {
  
  inline def apply(): DefineValidateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefineValidateOptions]
  }
  
  extension [Self <: DefineValidateOptions](x: Self) {
    
    inline def setContains(value: String | MsgString): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
    
    inline def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
    
    inline def setEquals_(value: String | MsgString): Self = StObject.set(x, "equals", value.asInstanceOf[js.Any])
    
    inline def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
    
    inline def setIs(value: String | (js.Array[String | js.RegExp]) | js.RegExp | Args): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
    
    inline def setIsAfter(value: String | ArgsString): Self = StObject.set(x, "isAfter", value.asInstanceOf[js.Any])
    
    inline def setIsAfterUndefined: Self = StObject.set(x, "isAfter", js.undefined)
    
    inline def setIsAlpha(value: Boolean | MsgString): Self = StObject.set(x, "isAlpha", value.asInstanceOf[js.Any])
    
    inline def setIsAlphaUndefined: Self = StObject.set(x, "isAlpha", js.undefined)
    
    inline def setIsAlphanumeric(value: Boolean | MsgString): Self = StObject.set(x, "isAlphanumeric", value.asInstanceOf[js.Any])
    
    inline def setIsAlphanumericUndefined: Self = StObject.set(x, "isAlphanumeric", js.undefined)
    
    inline def setIsArray(value: Boolean | ArgsBoolean): Self = StObject.set(x, "isArray", value.asInstanceOf[js.Any])
    
    inline def setIsArrayUndefined: Self = StObject.set(x, "isArray", js.undefined)
    
    inline def setIsBefore(value: String | ArgsString): Self = StObject.set(x, "isBefore", value.asInstanceOf[js.Any])
    
    inline def setIsBeforeUndefined: Self = StObject.set(x, "isBefore", js.undefined)
    
    inline def setIsCreditCard(value: Boolean | ArgsBoolean): Self = StObject.set(x, "isCreditCard", value.asInstanceOf[js.Any])
    
    inline def setIsCreditCardUndefined: Self = StObject.set(x, "isCreditCard", js.undefined)
    
    inline def setIsDate(value: Boolean | ArgsBoolean): Self = StObject.set(x, "isDate", value.asInstanceOf[js.Any])
    
    inline def setIsDateUndefined: Self = StObject.set(x, "isDate", js.undefined)
    
    inline def setIsDecimal(value: Boolean | MsgString): Self = StObject.set(x, "isDecimal", value.asInstanceOf[js.Any])
    
    inline def setIsDecimalUndefined: Self = StObject.set(x, "isDecimal", js.undefined)
    
    inline def setIsEmail(value: Boolean | MsgString): Self = StObject.set(x, "isEmail", value.asInstanceOf[js.Any])
    
    inline def setIsEmailUndefined: Self = StObject.set(x, "isEmail", js.undefined)
    
    inline def setIsFloat(value: Boolean | MsgString): Self = StObject.set(x, "isFloat", value.asInstanceOf[js.Any])
    
    inline def setIsFloatUndefined: Self = StObject.set(x, "isFloat", js.undefined)
    
    inline def setIsIP(value: Boolean | MsgString): Self = StObject.set(x, "isIP", value.asInstanceOf[js.Any])
    
    inline def setIsIPUndefined: Self = StObject.set(x, "isIP", js.undefined)
    
    inline def setIsIPv4(value: Boolean | MsgString): Self = StObject.set(x, "isIPv4", value.asInstanceOf[js.Any])
    
    inline def setIsIPv4Undefined: Self = StObject.set(x, "isIPv4", js.undefined)
    
    inline def setIsIPv6(value: Boolean | MsgString): Self = StObject.set(x, "isIPv6", value.asInstanceOf[js.Any])
    
    inline def setIsIPv6Undefined: Self = StObject.set(x, "isIPv6", js.undefined)
    
    inline def setIsIn(value: js.Array[js.Array[String]] | ArgsMsg): Self = StObject.set(x, "isIn", value.asInstanceOf[js.Any])
    
    inline def setIsInUndefined: Self = StObject.set(x, "isIn", js.undefined)
    
    inline def setIsInVarargs(value: js.Array[String]*): Self = StObject.set(x, "isIn", js.Array(value*))
    
    inline def setIsInt(value: Boolean | MsgString): Self = StObject.set(x, "isInt", value.asInstanceOf[js.Any])
    
    inline def setIsIntUndefined: Self = StObject.set(x, "isInt", js.undefined)
    
    inline def setIsLowercase(value: Boolean | MsgString): Self = StObject.set(x, "isLowercase", value.asInstanceOf[js.Any])
    
    inline def setIsLowercaseUndefined: Self = StObject.set(x, "isLowercase", js.undefined)
    
    inline def setIsNull(value: Boolean | MsgString): Self = StObject.set(x, "isNull", value.asInstanceOf[js.Any])
    
    inline def setIsNullUndefined: Self = StObject.set(x, "isNull", js.undefined)
    
    inline def setIsNumeric(value: Boolean | MsgString): Self = StObject.set(x, "isNumeric", value.asInstanceOf[js.Any])
    
    inline def setIsNumericUndefined: Self = StObject.set(x, "isNumeric", js.undefined)
    
    inline def setIsUUID(
      value: `3` | `4` | `5` | typingsJapgolly.sequelize.sequelizeStrings.`3` | typingsJapgolly.sequelize.sequelizeStrings.`4` | typingsJapgolly.sequelize.sequelizeStrings.`5` | all | ArgsNumber
    ): Self = StObject.set(x, "isUUID", value.asInstanceOf[js.Any])
    
    inline def setIsUUIDUndefined: Self = StObject.set(x, "isUUID", js.undefined)
    
    inline def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
    
    inline def setIsUppercase(value: Boolean | MsgString): Self = StObject.set(x, "isUppercase", value.asInstanceOf[js.Any])
    
    inline def setIsUppercaseUndefined: Self = StObject.set(x, "isUppercase", js.undefined)
    
    inline def setIsUrl(value: Boolean | MsgString): Self = StObject.set(x, "isUrl", value.asInstanceOf[js.Any])
    
    inline def setIsUrlUndefined: Self = StObject.set(x, "isUrl", js.undefined)
    
    inline def setIsVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "is", js.Array(value*))
    
    inline def setLen(value: (js.Tuple2[Double, Double]) | `1`): Self = StObject.set(x, "len", value.asInstanceOf[js.Any])
    
    inline def setLenUndefined: Self = StObject.set(x, "len", js.undefined)
    
    inline def setMax(value: Double | ArgsNumber): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double | ArgsNumber): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setNot(value: String | (js.Array[String | js.RegExp]) | js.RegExp | Args): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
    
    inline def setNotContains(value: js.Array[String] | String | ArgsMsgString): Self = StObject.set(x, "notContains", value.asInstanceOf[js.Any])
    
    inline def setNotContainsUndefined: Self = StObject.set(x, "notContains", js.undefined)
    
    inline def setNotContainsVarargs(value: String*): Self = StObject.set(x, "notContains", js.Array(value*))
    
    inline def setNotEmpty(value: Boolean | MsgString): Self = StObject.set(x, "notEmpty", value.asInstanceOf[js.Any])
    
    inline def setNotEmptyUndefined: Self = StObject.set(x, "notEmpty", js.undefined)
    
    inline def setNotIn(value: js.Array[js.Array[String]] | ArgsMsg): Self = StObject.set(x, "notIn", value.asInstanceOf[js.Any])
    
    inline def setNotInUndefined: Self = StObject.set(x, "notIn", js.undefined)
    
    inline def setNotInVarargs(value: js.Array[String]*): Self = StObject.set(x, "notIn", js.Array(value*))
    
    inline def setNotNull(value: Boolean | MsgString): Self = StObject.set(x, "notNull", value.asInstanceOf[js.Any])
    
    inline def setNotNullUndefined: Self = StObject.set(x, "notNull", js.undefined)
    
    inline def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
    
    inline def setNotVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "not", js.Array(value*))
  }
}
