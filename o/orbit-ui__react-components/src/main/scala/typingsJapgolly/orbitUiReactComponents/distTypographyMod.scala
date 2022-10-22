package typingsJapgolly.orbitUiReactComponents

import japgolly.scalajs.react.facade.React.ElementType
import org.scalajs.dom.HTMLElement
import typingsJapgolly.orbitUiReactComponents.anon.OmitInnerHeadingPropssize
import typingsJapgolly.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typingsJapgolly.orbitUiReactComponents.distTypographySrcHeadingMod.InnerHeadingProps
import typingsJapgolly.orbitUiReactComponents.distTypographySrcParagraphMod.InnerParagraphProps
import typingsJapgolly.orbitUiReactComponents.distTypographySrcTextMod.InnerTextProps
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypographyMod {
  
  @JSImport("@orbit-ui/react-components/dist/typography", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/typography", "H1")
  @js.native
  val H1: OrbitComponent[ElementType, OmitInnerHeadingPropssize] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/typography", "H2")
  @js.native
  val H2: OrbitComponent[ElementType, OmitInnerHeadingPropssize] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/typography", "H3")
  @js.native
  val H3: OrbitComponent[ElementType, OmitInnerHeadingPropssize] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/typography", "H4")
  @js.native
  val H4: OrbitComponent[ElementType, OmitInnerHeadingPropssize] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/typography", "H5")
  @js.native
  val H5: OrbitComponent[ElementType, OmitInnerHeadingPropssize] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/typography", "H6")
  @js.native
  val H6: OrbitComponent[ElementType, OmitInnerHeadingPropssize] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/typography", "Heading")
  @js.native
  val Heading: OrbitComponent[HTMLElement, InnerHeadingProps] = js.native
  
  inline def InnerHeading(props: InnerHeadingProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerHeading")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerParagraph(props: InnerParagraphProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerParagraph")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerText(props: InnerTextProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerText")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/typography", "P")
  @js.native
  val P: OrbitComponent[HTMLElement, InnerParagraphProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/typography", "Paragraph")
  @js.native
  val Paragraph: OrbitComponent[HTMLElement, InnerParagraphProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/typography", "Text")
  @js.native
  val Text: OrbitComponent[HTMLElement, InnerTextProps] = js.native
}
