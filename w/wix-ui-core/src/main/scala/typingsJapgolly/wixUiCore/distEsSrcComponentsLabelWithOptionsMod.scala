package typingsJapgolly.wixUiCore

import typingsJapgolly.wixUiCore.anon.InitialSelectedIds
import typingsJapgolly.wixUiCore.anon.PartialOption
import typingsJapgolly.wixUiCore.distEsSrcComponentsDropdownOptionOptionFactoryMod.Option
import typingsJapgolly.wixUiCore.distEsSrcComponentsLabelWithOptionsLabelWithOptionsMod.LabelWithOptionsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsLabelWithOptionsMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/label-with-options", "LabelWithOptions")
  @js.native
  open class LabelWithOptions protected ()
    extends typingsJapgolly.wixUiCore.distEsSrcComponentsLabelWithOptionsLabelWithOptionsMod.LabelWithOptions {
    def this(props: LabelWithOptionsProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: LabelWithOptionsProps, context: Any) = this()
  }
  /* static members */
  object LabelWithOptions {
    
    @JSImport("wix-ui-core/dist/es/src/components/label-with-options", "LabelWithOptions")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createDivider(): Option = ^.asInstanceOf[js.Dynamic].applyDynamic("createDivider")().asInstanceOf[Option]
    inline def createDivider(value: Any): Option = ^.asInstanceOf[js.Dynamic].applyDynamic("createDivider")(value.asInstanceOf[js.Any]).asInstanceOf[Option]
    
    inline def createOption(): Option = ^.asInstanceOf[js.Dynamic].applyDynamic("createOption")().asInstanceOf[Option]
    inline def createOption(option: PartialOption): Option = ^.asInstanceOf[js.Dynamic].applyDynamic("createOption")(option.asInstanceOf[js.Any]).asInstanceOf[Option]
    
    @JSImport("wix-ui-core/dist/es/src/components/label-with-options", "LabelWithOptions.defaultProps")
    @js.native
    def defaultProps: InitialSelectedIds = js.native
    inline def defaultProps_=(x: InitialSelectedIds): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/es/src/components/label-with-options", "LabelWithOptions.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
}
