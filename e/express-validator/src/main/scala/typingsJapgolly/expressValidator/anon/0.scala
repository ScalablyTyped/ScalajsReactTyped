package typingsJapgolly.expressValidator.anon

import typingsJapgolly.expressValidator.expressValidatorStrings.blacklist
import typingsJapgolly.expressValidator.expressValidatorStrings.customSanitizer
import typingsJapgolly.expressValidator.expressValidatorStrings.default
import typingsJapgolly.expressValidator.expressValidatorStrings.escape
import typingsJapgolly.expressValidator.expressValidatorStrings.ltrim
import typingsJapgolly.expressValidator.expressValidatorStrings.normalizeEmail
import typingsJapgolly.expressValidator.expressValidatorStrings.replace
import typingsJapgolly.expressValidator.expressValidatorStrings.rtrim
import typingsJapgolly.expressValidator.expressValidatorStrings.stripLow
import typingsJapgolly.expressValidator.expressValidatorStrings.toArray
import typingsJapgolly.expressValidator.expressValidatorStrings.toBoolean
import typingsJapgolly.expressValidator.expressValidatorStrings.toDate
import typingsJapgolly.expressValidator.expressValidatorStrings.toFloat
import typingsJapgolly.expressValidator.expressValidatorStrings.toInt
import typingsJapgolly.expressValidator.expressValidatorStrings.toLowerCase
import typingsJapgolly.expressValidator.expressValidatorStrings.toUpperCase
import typingsJapgolly.expressValidator.expressValidatorStrings.trim
import typingsJapgolly.expressValidator.expressValidatorStrings.unescape
import typingsJapgolly.expressValidator.expressValidatorStrings.whitelist
import typingsJapgolly.expressValidator.srcMiddlewaresSchemaMod.SanitizerSchemaOptions
import typingsJapgolly.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0`[K /* <: /* keyof express-validator.express-validator/src/chain/sanitizers.Sanitizers<any> */ customSanitizer | default | replace | blacklist | escape | unescape | ltrim | normalizeEmail | rtrim | stripLow | toArray | toBoolean | toDate | toFloat | toInt | toLowerCase | toUpperCase | trim | whitelist */]
  extends StObject
     with SanitizerSchemaOptions[K] {
  
  var options: js.UndefOr[
    (Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: express-validator.express-validator/src/chain/sanitizers.Sanitizers<any>[K] */ js.Any
    ]) | (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<express-validator.express-validator/src/chain/sanitizers.Sanitizers<any>[K]>[0] */ js.Any)
  ] = js.undefined
}
object `0` {
  
  inline def apply[K /* <: /* keyof express-validator.express-validator/src/chain/sanitizers.Sanitizers<any> */ customSanitizer | default | replace | blacklist | escape | unescape | ltrim | normalizeEmail | rtrim | stripLow | toArray | toBoolean | toDate | toFloat | toInt | toLowerCase | toUpperCase | trim | whitelist */](): `0`[K] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`0`[K]]
  }
  
  extension [Self <: `0`[?], K /* <: /* keyof express-validator.express-validator/src/chain/sanitizers.Sanitizers<any> */ customSanitizer | default | replace | blacklist | escape | unescape | ltrim | normalizeEmail | rtrim | stripLow | toArray | toBoolean | toDate | toFloat | toInt | toLowerCase | toUpperCase | trim | whitelist */](x: Self & `0`[K]) {
    
    inline def setOptions(
      value: (Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: express-validator.express-validator/src/chain/sanitizers.Sanitizers<any>[K] */ js.Any
        ]) | (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<express-validator.express-validator/src/chain/sanitizers.Sanitizers<any>[K]>[0] */ js.Any)
    ): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
