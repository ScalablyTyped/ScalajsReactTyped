package typingsJapgolly.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.materialUiCore.listListMod.ListTypeMap
import typingsJapgolly.materialUiCore.materialUiCoreStrings.ul
import typingsJapgolly.materialUiCore.overridableComponentMod.OverridableComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Lists](https://mui.com/components/lists/)
    * - [Transfer List](https://mui.com/components/transfer-list/)
    *
    * API:
    *
    * - [List API](https://mui.com/api/list/)
    */
  @JSImport("@material-ui/core/List", JSImport.Default)
  @js.native
  val default: OverridableComponent[ListTypeMap[js.Object, ul]] = js.native
  
  type _To = OverridableComponent[ListTypeMap[js.Object, ul]]
  
  /* This means you don't have to write `default`, but can instead just say `listMod.foo` */
  override def _to: OverridableComponent[ListTypeMap[js.Object, ul]] = default
}
