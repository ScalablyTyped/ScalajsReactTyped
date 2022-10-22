package typingsJapgolly.cronParser

import typingsJapgolly.cronParser.typesCommonMod.ParserOptions
import typingsJapgolly.cronParser.typesMod.CronExpression
import typingsJapgolly.cronParser.typesMod.CronFields
import typingsJapgolly.cronParser.typesMod.StringResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cron-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fieldsToExpression[IsIterable /* <: Boolean */](fields: CronFields): CronExpression[IsIterable] = ^.asInstanceOf[js.Dynamic].applyDynamic("fieldsToExpression")(fields.asInstanceOf[js.Any]).asInstanceOf[CronExpression[IsIterable]]
  inline def fieldsToExpression[IsIterable /* <: Boolean */](fields: CronFields, options: ParserOptions[IsIterable]): CronExpression[IsIterable] = (^.asInstanceOf[js.Dynamic].applyDynamic("fieldsToExpression")(fields.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CronExpression[IsIterable]]
  
  inline def parseExpression[IsIterable /* <: Boolean */](expression: String): CronExpression[IsIterable] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseExpression")(expression.asInstanceOf[js.Any]).asInstanceOf[CronExpression[IsIterable]]
  inline def parseExpression[IsIterable /* <: Boolean */](expression: String, options: ParserOptions[IsIterable]): CronExpression[IsIterable] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseExpression")(expression.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CronExpression[IsIterable]]
  
  inline def parseFile(filePath: String, callback: js.Function2[/* err */ Any, /* data */ StringResult, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFile")(filePath.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def parseString(data: String): StringResult = ^.asInstanceOf[js.Dynamic].applyDynamic("parseString")(data.asInstanceOf[js.Any]).asInstanceOf[StringResult]
}
