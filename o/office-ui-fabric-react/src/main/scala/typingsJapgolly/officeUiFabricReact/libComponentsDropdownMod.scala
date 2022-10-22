package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.anon.Options
import typingsJapgolly.officeUiFabricReact.libComponentsDropdownDropdownDottypesMod.IDropdownProps
import typingsJapgolly.officeUiFabricReact.libUtilitiesSelectableOptionSelectableOptionDottypesMod.SelectableOptionMenuItemType
import typingsJapgolly.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsDropdownMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Dropdown", "Dropdown")
  @js.native
  val Dropdown: FunctionComponent[IDropdownProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Dropdown", "DropdownBase")
  @js.native
  open class DropdownBase protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsDropdownDropdownDotbaseMod.DropdownBase {
    def this(props: IDropdownProps) = this()
  }
  /* static members */
  object DropdownBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Dropdown", "DropdownBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Dropdown", "DropdownBase.defaultProps")
    @js.native
    def defaultProps: Options = js.native
    inline def defaultProps_=(x: Options): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Dropdown", "DropdownMenuItemType")
  @js.native
  object DropdownMenuItemType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SelectableOptionMenuItemType & Double] = js.native
    
    /* 1 */ val Divider: typingsJapgolly.officeUiFabricReact.libUtilitiesSelectableOptionSelectableOptionDottypesMod.SelectableOptionMenuItemType.Divider & Double = js.native
    
    /* 2 */ val Header: typingsJapgolly.officeUiFabricReact.libUtilitiesSelectableOptionSelectableOptionDottypesMod.SelectableOptionMenuItemType.Header & Double = js.native
    
    /* 0 */ val Normal: typingsJapgolly.officeUiFabricReact.libUtilitiesSelectableOptionSelectableOptionDottypesMod.SelectableOptionMenuItemType.Normal & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Dropdown", "ResponsiveMode")
  @js.native
  object ResponsiveMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.officeUiFabricReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode & Double
      ] = js.native
    
    /* 2 */ val large: typingsJapgolly.officeUiFabricReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode.large & Double = js.native
    
    /* 1 */ val medium: typingsJapgolly.officeUiFabricReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode.medium & Double = js.native
    
    /* 0 */ val small: typingsJapgolly.officeUiFabricReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode.small & Double = js.native
    
    /* 999 */ val unknown: typingsJapgolly.officeUiFabricReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode.unknown & Double = js.native
    
    /* 3 */ val xLarge: typingsJapgolly.officeUiFabricReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode.xLarge & Double = js.native
    
    /* 4 */ val xxLarge: typingsJapgolly.officeUiFabricReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode.xxLarge & Double = js.native
    
    /* 5 */ val xxxLarge: typingsJapgolly.officeUiFabricReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode.xxxLarge & Double = js.native
  }
}
