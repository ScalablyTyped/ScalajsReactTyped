package typingsJapgolly.wixUiCore

import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.wixUiCore.anon.Checked
import typingsJapgolly.wixUiCore.anon.CompId
import typingsJapgolly.wixUiCore.distEsSrcComponentsTagsListTagMod.TagProps
import typingsJapgolly.wixUiCore.distEsSrcComponentsTagsListTagsListDothelpersMod.DisplayNames
import typingsJapgolly.wixUiCore.distEsSrcComponentsTagsListTagsListMod.TagsListProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsTagsListMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/tags-list", "FocusableTag")
  @js.native
  open class FocusableTag protected ()
    extends typingsJapgolly.wixUiCore.distEsSrcComponentsTagsListTagMod.FocusableTag {
    def this(props: TagProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TagProps, context: Any) = this()
  }
  /* static members */
  object FocusableTag {
    
    @JSImport("wix-ui-core/dist/es/src/components/tags-list", "FocusableTag")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/es/src/components/tags-list", "FocusableTag.displayName")
    @js.native
    def displayName: DisplayNames = js.native
    inline def displayName_=(x: DisplayNames): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/es/src/components/tags-list", "FocusableTag.propTypes")
    @js.native
    def propTypes: Checked = js.native
    inline def propTypes_=(x: Checked): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("wix-ui-core/dist/es/src/components/tags-list", "Tag")
  @js.native
  open class Tag protected ()
    extends typingsJapgolly.wixUiCore.distEsSrcComponentsTagsListTagMod.Tag {
    def this(props: TagProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TagProps, context: Any) = this()
  }
  /* static members */
  object Tag {
    
    @JSImport("wix-ui-core/dist/es/src/components/tags-list", "Tag")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/es/src/components/tags-list", "Tag.displayName")
    @js.native
    def displayName: DisplayNames = js.native
    inline def displayName_=(x: DisplayNames): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/es/src/components/tags-list", "Tag.propTypes")
    @js.native
    def propTypes: CompId = js.native
    inline def propTypes_=(x: CompId): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("wix-ui-core/dist/es/src/components/tags-list", "TagsList")
  @js.native
  val TagsList: FunctionComponent[TagsListProps] = js.native
}
