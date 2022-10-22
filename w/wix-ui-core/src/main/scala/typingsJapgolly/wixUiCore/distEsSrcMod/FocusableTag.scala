package typingsJapgolly.wixUiCore.distEsSrcMod

import typingsJapgolly.wixUiCore.anon.Checked
import typingsJapgolly.wixUiCore.distEsSrcComponentsTagsListTagMod.TagProps
import typingsJapgolly.wixUiCore.distEsSrcComponentsTagsListTagsListDothelpersMod.DisplayNames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wix-ui-core/dist/es/src", "FocusableTag")
@js.native
open class FocusableTag protected ()
  extends typingsJapgolly.wixUiCore.distEsSrcComponentsTagsListMod.FocusableTag {
  def this(props: TagProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: TagProps, context: Any) = this()
}
/* static members */
object FocusableTag {
  
  @JSImport("wix-ui-core/dist/es/src", "FocusableTag")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-ui-core/dist/es/src", "FocusableTag.displayName")
  @js.native
  def displayName: DisplayNames = js.native
  inline def displayName_=(x: DisplayNames): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-ui-core/dist/es/src", "FocusableTag.propTypes")
  @js.native
  def propTypes: Checked = js.native
  inline def propTypes_=(x: Checked): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
