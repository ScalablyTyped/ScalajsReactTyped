package typingsJapgolly.reactMdIcon

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLSpanElement
import org.scalajs.dom.SVGSVGElement
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactMdIcon.reactMdIconStrings.back
import typingsJapgolly.reactMdIcon.reactMdIconStrings.checkbox
import typingsJapgolly.reactMdIcon.reactMdIconStrings.dropdown
import typingsJapgolly.reactMdIcon.reactMdIconStrings.error
import typingsJapgolly.reactMdIcon.reactMdIconStrings.expander
import typingsJapgolly.reactMdIcon.reactMdIconStrings.forward
import typingsJapgolly.reactMdIcon.reactMdIconStrings.menu
import typingsJapgolly.reactMdIcon.reactMdIconStrings.notification
import typingsJapgolly.reactMdIcon.reactMdIconStrings.password
import typingsJapgolly.reactMdIcon.reactMdIconStrings.radio
import typingsJapgolly.reactMdIcon.reactMdIconStrings.selected
import typingsJapgolly.reactMdIcon.reactMdIconStrings.sort
import typingsJapgolly.reactMdIcon.reactMdIconStrings.upload
import typingsJapgolly.reactMdIcon.typesFontIconMod.FontIconProps
import typingsJapgolly.reactMdIcon.typesIconProviderMod.IconProviderProps
import typingsJapgolly.reactMdIcon.typesIconRotatorMod.IconRotatorProps
import typingsJapgolly.reactMdIcon.typesSvgiconMod.SVGIconProps
import typingsJapgolly.reactMdIcon.typesTextIconSpacingMod.TextIconSpacingProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/icon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/icon", "FontIcon")
  @js.native
  val FontIcon: ForwardRefExoticComponent[FontIconProps & RefAttributes[HTMLElement]] = js.native
  
  inline def IconProvider(
    hasChildrenBackCheckboxDropdownExpanderErrorForwardMenuNotificationPasswordRadioSelectedSortUpload: IconProviderProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("IconProvider")(hasChildrenBackCheckboxDropdownExpanderErrorForwardMenuNotificationPasswordRadioSelectedSortUpload.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@react-md/icon", "IconRotator")
  @js.native
  val IconRotator: ForwardRefExoticComponent[IconRotatorProps & RefAttributes[HTMLSpanElement]] = js.native
  
  @JSImport("@react-md/icon", "SVGIcon")
  @js.native
  val SVGIcon: ForwardRefExoticComponent[SVGIconProps & RefAttributes[SVGSVGElement]] = js.native
  
  inline def TextIconSpacing(
    hasClassNamePropIconChildrenStackedIconAfterFlexReverseForceIconWrapBeforeClassNameAfterClassNameAboveClassNameBelowClassName: TextIconSpacingProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TextIconSpacing")(hasClassNamePropIconChildrenStackedIconAfterFlexReverseForceIconWrapBeforeClassNameAfterClassNameAboveClassNameBelowClassName.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useIcon(
    name: back | checkbox | dropdown | error | expander | forward | menu | notification | password | radio | selected | sort | upload
  ): Node = ^.asInstanceOf[js.Dynamic].applyDynamic("useIcon")(name.asInstanceOf[js.Any]).asInstanceOf[Node]
  inline def useIcon(
    name: back | checkbox | dropdown | error | expander | forward | menu | notification | password | radio | selected | sort | upload,
    `override`: Node
  ): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("useIcon")(name.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[Node]
}
