package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fluentuiTheme.libTypesIthemeMod.ITheme
import typingsJapgolly.officeUiFabricReact.libComponentsCheckCheckDottypesMod.ICheckProps
import typingsJapgolly.officeUiFabricReact.libComponentsCheckCheckDottypesMod.ICheckStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsCheckCheckDottypesMod.ICheckStyles
import typingsJapgolly.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typingsJapgolly.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_ICheckProps1576676291 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def alwaysShowCheck(value: Boolean): this.type = set("alwaysShowCheck", value.asInstanceOf[js.Any])
  
  inline def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def componentRef(value: IRefObject[ICheckProps]): this.type = set("componentRef", value.asInstanceOf[js.Any])
  
  inline def componentRefFunction1(value: /* ref */ ICheckProps | Null => Callback): this.type = set("componentRef", js.Any.fromFunction1((t0: /* ref */ ICheckProps | Null) => value(t0).runNow()))
  
  inline def styles(value: IStyleFunctionOrObject[ICheckStyleProps, ICheckStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
  
  inline def stylesFunction1(value: ICheckStyleProps => DeepPartial[ICheckStyles]): this.type = set("styles", js.Any.fromFunction1(value))
  
  inline def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
  
  inline def useFastIcons(value: Boolean): this.type = set("useFastIcons", value.asInstanceOf[js.Any])
}
