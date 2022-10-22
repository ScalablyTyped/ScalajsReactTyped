package typingsJapgolly.prismicDom

import typingsJapgolly.prismicDom.prismicDomStrings.`group-list-item`
import typingsJapgolly.prismicDom.prismicDomStrings.`group-o-list-item`
import typingsJapgolly.prismicDom.prismicDomStrings.`list-item`
import typingsJapgolly.prismicDom.prismicDomStrings.`o-list-item`
import typingsJapgolly.prismicDom.prismicDomStrings.em
import typingsJapgolly.prismicDom.prismicDomStrings.embed
import typingsJapgolly.prismicDom.prismicDomStrings.heading1
import typingsJapgolly.prismicDom.prismicDomStrings.heading2
import typingsJapgolly.prismicDom.prismicDomStrings.heading3
import typingsJapgolly.prismicDom.prismicDomStrings.heading4
import typingsJapgolly.prismicDom.prismicDomStrings.heading5
import typingsJapgolly.prismicDom.prismicDomStrings.heading6
import typingsJapgolly.prismicDom.prismicDomStrings.hyperlink
import typingsJapgolly.prismicDom.prismicDomStrings.image
import typingsJapgolly.prismicDom.prismicDomStrings.label
import typingsJapgolly.prismicDom.prismicDomStrings.paragraph
import typingsJapgolly.prismicDom.prismicDomStrings.preformatted
import typingsJapgolly.prismicDom.prismicDomStrings.span
import typingsJapgolly.prismicDom.prismicDomStrings.strong
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("prismic-dom", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("prismic-dom", "default.Link")
    @js.native
    def Link: typingsJapgolly.prismicDom.mod.Link = js.native
    inline def Link_=(x: typingsJapgolly.prismicDom.mod.Link): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Link")(x.asInstanceOf[js.Any])
    
    @JSImport("prismic-dom", "default.RichText")
    @js.native
    def RichText: typingsJapgolly.prismicDom.mod.RichText = js.native
    inline def RichText_=(x: typingsJapgolly.prismicDom.mod.RichText): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RichText")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("prismic-dom", "HTMLSerializer")
  @js.native
  val HTMLSerializer: typingsJapgolly.prismicDom.mod.HTMLSerializer[String] = js.native
  type HTMLSerializer[T] = js.Function5[
    /* type */ ElementType, 
    /* element */ Any, 
    /* text */ String | Null, 
    /* children */ js.Array[T], 
    /* index */ Double, 
    T
  ]
  
  @js.native
  trait Link extends StObject {
    
    def url(link: Any): String = js.native
    def url(link: Any, linkResolver: js.Function1[/* doc */ Any, String]): String = js.native
  }
  @JSImport("prismic-dom", "Link")
  @js.native
  val Link: typingsJapgolly.prismicDom.mod.Link = js.native
  
  @js.native
  trait RichText extends StObject {
    
    var Elements: typingsJapgolly.prismicDom.mod.Elements = js.native
    
    def asHtml(richText: Any): String = js.native
    def asHtml(richText: Any, linkResolver: js.Function1[/* doc */ Any, String]): String = js.native
    def asHtml(
      richText: Any,
      linkResolver: js.Function1[/* doc */ Any, String],
      serializer: typingsJapgolly.prismicDom.mod.HTMLSerializer[String]
    ): String = js.native
    def asHtml(
      richText: Any,
      linkResolver: Unit,
      serializer: typingsJapgolly.prismicDom.mod.HTMLSerializer[String]
    ): String = js.native
    
    def asText(richText: Any): String = js.native
    def asText(richText: Any, joinString: String): String = js.native
  }
  @JSImport("prismic-dom", "RichText")
  @js.native
  val RichText: typingsJapgolly.prismicDom.mod.RichText = js.native
  
  /* Inlined prismic-dom.prismic-dom.Elements[keyof prismic-dom.prismic-dom.Elements] */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.prismicDom.prismicDomStrings.`list-item`
    - typingsJapgolly.prismicDom.prismicDomStrings.`group-list-item`
    - typingsJapgolly.prismicDom.prismicDomStrings.heading6
    - typingsJapgolly.prismicDom.prismicDomStrings.`o-list-item`
    - typingsJapgolly.prismicDom.prismicDomStrings.heading2
    - typingsJapgolly.prismicDom.prismicDomStrings.hyperlink
    - typingsJapgolly.prismicDom.prismicDomStrings.image
    - typingsJapgolly.prismicDom.prismicDomStrings.heading5
    - typingsJapgolly.prismicDom.prismicDomStrings.paragraph
    - typingsJapgolly.prismicDom.prismicDomStrings.preformatted
    - typingsJapgolly.prismicDom.prismicDomStrings.strong
    - typingsJapgolly.prismicDom.prismicDomStrings.span
    - typingsJapgolly.prismicDom.prismicDomStrings.heading3
    - typingsJapgolly.prismicDom.prismicDomStrings.em
    - typingsJapgolly.prismicDom.prismicDomStrings.heading4
    - typingsJapgolly.prismicDom.prismicDomStrings.label
    - typingsJapgolly.prismicDom.prismicDomStrings.`group-o-list-item`
    - typingsJapgolly.prismicDom.prismicDomStrings.embed
    - typingsJapgolly.prismicDom.prismicDomStrings.heading1
  */
  trait ElementType extends StObject
  object ElementType {
    
    inline def em: typingsJapgolly.prismicDom.prismicDomStrings.em = "em".asInstanceOf[typingsJapgolly.prismicDom.prismicDomStrings.em]
    
    inline def embed: typingsJapgolly.prismicDom.prismicDomStrings.embed = "embed".asInstanceOf[typingsJapgolly.prismicDom.prismicDomStrings.embed]
    
    inline def `group-list-item`: typingsJapgolly.prismicDom.prismicDomStrings.`group-list-item` = "group-list-item".asInstanceOf[typingsJapgolly.prismicDom.prismicDomStrings.`group-list-item`]
    
    inline def `group-o-list-item`: typingsJapgolly.prismicDom.prismicDomStrings.`group-o-list-item` = "group-o-list-item".asInstanceOf[typingsJapgolly.prismicDom.prismicDomStrings.`group-o-list-item`]
    
    inline def heading1: typingsJapgolly.prismicDom.prismicDomStrings.heading1 = "heading1".asInstanceOf[typingsJapgolly.prismicDom.prismicDomStrings.heading1]
    
    inline def heading2: typingsJapgolly.prismicDom.prismicDomStrings.heading2 = "heading2".asInstanceOf[typingsJapgolly.prismicDom.prismicDomStrings.heading2]
    
    inline def heading3: typingsJapgolly.prismicDom.prismicDomStrings.heading3 = "heading3".asInstanceOf[typingsJapgolly.prismicDom.prismicDomStrings.heading3]
    
    inline def heading4: typingsJapgolly.prismicDom.prismicDomStrings.heading4 = "heading4".asInstanceOf[typingsJapgolly.prismicDom.prismicDomStrings.heading4]
    
    inline def heading5: typingsJapgolly.prismicDom.prismicDomStrings.heading5 = "heading5".asInstanceOf[typingsJapgolly.prismicDom.prismicDomStrings.heading5]
    
    inline def heading6: typingsJapgolly.prismicDom.prismicDomStrings.heading6 = "heading6".asInstanceOf[typingsJapgolly.prismicDom.prismicDomStrings.heading6]
    
    inline def hyperlink: typingsJapgolly.prismicDom.prismicDomStrings.hyperlink = "hyperlink".asInstanceOf[typingsJapgolly.prismicDom.prismicDomStrings.hyperlink]
    
    inline def image: typingsJapgolly.prismicDom.prismicDomStrings.image = "image".asInstanceOf[typingsJapgolly.prismicDom.prismicDomStrings.image]
    
    inline def label: typingsJapgolly.prismicDom.prismicDomStrings.label = "label".asInstanceOf[typingsJapgolly.prismicDom.prismicDomStrings.label]
    
    inline def `list-item`: typingsJapgolly.prismicDom.prismicDomStrings.`list-item` = "list-item".asInstanceOf[typingsJapgolly.prismicDom.prismicDomStrings.`list-item`]
    
    inline def `o-list-item`: typingsJapgolly.prismicDom.prismicDomStrings.`o-list-item` = "o-list-item".asInstanceOf[typingsJapgolly.prismicDom.prismicDomStrings.`o-list-item`]
    
    inline def paragraph: typingsJapgolly.prismicDom.prismicDomStrings.paragraph = "paragraph".asInstanceOf[typingsJapgolly.prismicDom.prismicDomStrings.paragraph]
    
    inline def preformatted: typingsJapgolly.prismicDom.prismicDomStrings.preformatted = "preformatted".asInstanceOf[typingsJapgolly.prismicDom.prismicDomStrings.preformatted]
    
    inline def span: typingsJapgolly.prismicDom.prismicDomStrings.span = "span".asInstanceOf[typingsJapgolly.prismicDom.prismicDomStrings.span]
    
    inline def strong: typingsJapgolly.prismicDom.prismicDomStrings.strong = "strong".asInstanceOf[typingsJapgolly.prismicDom.prismicDomStrings.strong]
  }
  
  trait Elements extends StObject {
    
    var em: typingsJapgolly.prismicDom.prismicDomStrings.em
    
    var embed: typingsJapgolly.prismicDom.prismicDomStrings.embed
    
    var heading1: typingsJapgolly.prismicDom.prismicDomStrings.heading1
    
    var heading2: typingsJapgolly.prismicDom.prismicDomStrings.heading2
    
    var heading3: typingsJapgolly.prismicDom.prismicDomStrings.heading3
    
    var heading4: typingsJapgolly.prismicDom.prismicDomStrings.heading4
    
    var heading5: typingsJapgolly.prismicDom.prismicDomStrings.heading5
    
    var heading6: typingsJapgolly.prismicDom.prismicDomStrings.heading6
    
    var hyperlink: typingsJapgolly.prismicDom.prismicDomStrings.hyperlink
    
    var image: typingsJapgolly.prismicDom.prismicDomStrings.image
    
    var label: typingsJapgolly.prismicDom.prismicDomStrings.label
    
    var list: `group-list-item`
    
    var listItem: `list-item`
    
    var oList: `group-o-list-item`
    
    var oListItem: `o-list-item`
    
    var paragraph: typingsJapgolly.prismicDom.prismicDomStrings.paragraph
    
    var preformatted: typingsJapgolly.prismicDom.prismicDomStrings.preformatted
    
    var span: typingsJapgolly.prismicDom.prismicDomStrings.span
    
    var strong: typingsJapgolly.prismicDom.prismicDomStrings.strong
  }
  object Elements {
    
    inline def apply(): Elements = {
      val __obj = js.Dynamic.literal(em = "em", embed = "embed", heading1 = "heading1", heading2 = "heading2", heading3 = "heading3", heading4 = "heading4", heading5 = "heading5", heading6 = "heading6", hyperlink = "hyperlink", image = "image", label = "label", list = "group-list-item", listItem = "list-item", oList = "group-o-list-item", oListItem = "o-list-item", paragraph = "paragraph", preformatted = "preformatted", span = "span", strong = "strong")
      __obj.asInstanceOf[Elements]
    }
    
    extension [Self <: Elements](x: Self) {
      
      inline def setEm(value: em): Self = StObject.set(x, "em", value.asInstanceOf[js.Any])
      
      inline def setEmbed(value: embed): Self = StObject.set(x, "embed", value.asInstanceOf[js.Any])
      
      inline def setHeading1(value: heading1): Self = StObject.set(x, "heading1", value.asInstanceOf[js.Any])
      
      inline def setHeading2(value: heading2): Self = StObject.set(x, "heading2", value.asInstanceOf[js.Any])
      
      inline def setHeading3(value: heading3): Self = StObject.set(x, "heading3", value.asInstanceOf[js.Any])
      
      inline def setHeading4(value: heading4): Self = StObject.set(x, "heading4", value.asInstanceOf[js.Any])
      
      inline def setHeading5(value: heading5): Self = StObject.set(x, "heading5", value.asInstanceOf[js.Any])
      
      inline def setHeading6(value: heading6): Self = StObject.set(x, "heading6", value.asInstanceOf[js.Any])
      
      inline def setHyperlink(value: hyperlink): Self = StObject.set(x, "hyperlink", value.asInstanceOf[js.Any])
      
      inline def setImage(value: image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: label): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setList(value: `group-list-item`): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setListItem(value: `list-item`): Self = StObject.set(x, "listItem", value.asInstanceOf[js.Any])
      
      inline def setOList(value: `group-o-list-item`): Self = StObject.set(x, "oList", value.asInstanceOf[js.Any])
      
      inline def setOListItem(value: `o-list-item`): Self = StObject.set(x, "oListItem", value.asInstanceOf[js.Any])
      
      inline def setParagraph(value: paragraph): Self = StObject.set(x, "paragraph", value.asInstanceOf[js.Any])
      
      inline def setPreformatted(value: preformatted): Self = StObject.set(x, "preformatted", value.asInstanceOf[js.Any])
      
      inline def setSpan(value: span): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      inline def setStrong(value: strong): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
    }
  }
}
