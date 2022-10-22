package typingsJapgolly.officeUiFabricReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fluentuiTheme.libTypesIthemeMod.ITheme
import typingsJapgolly.officeUiFabricReact.libComponentsDividerVerticalDividerDottypesMod.IVerticalDividerClassNames
import typingsJapgolly.officeUiFabricReact.libComponentsDividerVerticalDividerDottypesMod.IVerticalDividerPropsStyles
import typingsJapgolly.officeUiFabricReact.libComponentsDividerVerticalDividerDottypesMod.IVerticalDividerStyles
import typingsJapgolly.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typingsJapgolly.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_IVerticalDividerProps_1580901733 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def getClassNames(value: /* theme */ ITheme => IVerticalDividerClassNames): this.type = set("getClassNames", js.Any.fromFunction1(value))
  
  inline def styles(value: IStyleFunctionOrObject[IVerticalDividerPropsStyles, IVerticalDividerStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
  
  inline def stylesFunction1(value: IVerticalDividerPropsStyles => DeepPartial[IVerticalDividerStyles]): this.type = set("styles", js.Any.fromFunction1(value))
  
  inline def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
}
