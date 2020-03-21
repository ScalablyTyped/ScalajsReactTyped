package typingsJapgolly.officeUiFabricReact.documentCardLocationTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.officeUiFabricReact.documentCardLocationBaseMod.DocumentCardLocationBase
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDocumentCardLocationProps extends ClassAttributes[DocumentCardLocationBase] {
  /**
    * Aria label for the link to the document location.
    */
  var ariaLabel: js.UndefOr[String] = js.undefined
  /**
    * Optional override class name
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Gets the component ref.
    */
  var componentRef: js.UndefOr[IRefObject[IDocumentCardLocation]] = js.undefined
  /**
    * Text for the location of the document.
    */
  var location: String
  /**
    * URL to navigate to for this location.
    */
  var locationHref: js.UndefOr[String] = js.undefined
  /**
    * Function to call when the location is clicked.
    */
  var onClick: js.UndefOr[js.Function1[/* ev */ js.UndefOr[ReactMouseEventFrom[HTMLElement]], Unit]] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules
    */
  var styles: js.UndefOr[
    IStyleFunctionOrObject[IDocumentCardLocationStyleProps, IDocumentCardLocationStyles]
  ] = js.undefined
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
}

object IDocumentCardLocationProps {
  @scala.inline
  def apply(
    location: String,
    ariaLabel: String = null,
    className: String = null,
    componentRef: IRefObject[IDocumentCardLocation] = null,
    key: Key = null,
    locationHref: String = null,
    onClick: /* ev */ js.UndefOr[ReactMouseEventFrom[HTMLElement]] => Callback = null,
    ref: LegacyRef[DocumentCardLocationBase] = null,
    styles: IStyleFunctionOrObject[IDocumentCardLocationStyleProps, IDocumentCardLocationStyles] = null,
    theme: ITheme = null
  ): IDocumentCardLocationProps = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (locationHref != null) __obj.updateDynamic("locationHref")(locationHref.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* ev */ js.UndefOr[japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]]) => onClick(t0).runNow()))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocumentCardLocationProps]
  }
}

