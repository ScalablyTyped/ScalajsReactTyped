package typingsJapgolly.reactMdTypography

import japgolly.scalajs.react.facade.React.ElementType
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactMdTypography.typesSrOnlyMod.SrOnlyProps
import typingsJapgolly.reactMdTypography.typesTextContainerMod.TextContainerProps
import typingsJapgolly.reactMdTypography.typesTypographyMod.TypographyHTMLElement
import typingsJapgolly.reactMdTypography.typesTypographyMod.TypographyProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/typography", "SrOnly")
  @js.native
  val SrOnly: ForwardRefExoticComponent[SrOnlyProps & RefAttributes[TypographyHTMLElement]] = js.native
  
  @JSImport("@react-md/typography", "TextContainer")
  @js.native
  val TextContainer: ForwardRefExoticComponent[TextContainerProps & (RefAttributes[HTMLDivElement | ElementType])] = js.native
  
  @JSImport("@react-md/typography", "Typography")
  @js.native
  val Typography: ForwardRefExoticComponent[TypographyProps & RefAttributes[TypographyHTMLElement]] = js.native
}
