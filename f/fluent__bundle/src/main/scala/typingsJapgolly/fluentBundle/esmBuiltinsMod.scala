package typingsJapgolly.fluentBundle

import typingsJapgolly.fluentBundle.esmTypesMod.FluentValue
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmBuiltinsMod {
  
  @JSImport("@fluent/bundle/esm/builtins", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def DATETIME(args: js.Array[FluentValue], opts: Record[String, FluentValue]): FluentValue = (^.asInstanceOf[js.Dynamic].applyDynamic("DATETIME")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[FluentValue]
  
  inline def NUMBER(args: js.Array[FluentValue], opts: Record[String, FluentValue]): FluentValue = (^.asInstanceOf[js.Dynamic].applyDynamic("NUMBER")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[FluentValue]
}
