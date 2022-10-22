package typingsJapgolly.domHelpers

import org.scalajs.dom.HTMLElement
import typingsJapgolly.domHelpers.anon.PartialRecordPropertystri
import typingsJapgolly.domHelpers.cjsTypesMod.CamelProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsCssMod {
  
  @JSImport("dom-helpers/cjs/css", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(node: HTMLElement, property: PartialRecordPropertystri): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default[T /* <: CamelProperty */](node: HTMLElement, property: T): /* import warning: importer.ImportType#apply Failed type conversion: csstype.csstype.Properties<string & {} | 0, string & {}>[T] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: csstype.csstype.Properties<string & {} | 0, string & {}>[T] */ js.Any]
}
