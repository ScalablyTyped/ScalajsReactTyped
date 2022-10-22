package typingsJapgolly.devextremeRuntime

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsCommonNormalizeStylesMod {
  
  @JSImport("@devextreme/runtime/cjs/common/normalize-styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def normalizeStyles(styles: Any): js.UndefOr[Record[String, String | Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeStyles")(styles.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Record[String, String | Double]]]
}
