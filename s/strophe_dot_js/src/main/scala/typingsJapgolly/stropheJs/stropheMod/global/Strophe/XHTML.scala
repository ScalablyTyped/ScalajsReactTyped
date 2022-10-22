package typingsJapgolly.stropheJs.stropheMod.global.Strophe

import typingsJapgolly.stropheJs.anon.A
import typingsJapgolly.stropheJs.stropheJsStrings.`background-color`
import typingsJapgolly.stropheJs.stropheJsStrings.`font-family`
import typingsJapgolly.stropheJs.stropheJsStrings.`font-size`
import typingsJapgolly.stropheJs.stropheJsStrings.`font-style`
import typingsJapgolly.stropheJs.stropheJsStrings.`font-weight`
import typingsJapgolly.stropheJs.stropheJsStrings.`margin-left`
import typingsJapgolly.stropheJs.stropheJsStrings.`margin-right`
import typingsJapgolly.stropheJs.stropheJsStrings.`text-align`
import typingsJapgolly.stropheJs.stropheJsStrings.`text-decoration`
import typingsJapgolly.stropheJs.stropheJsStrings.a
import typingsJapgolly.stropheJs.stropheJsStrings.blockquote
import typingsJapgolly.stropheJs.stropheJsStrings.body
import typingsJapgolly.stropheJs.stropheJsStrings.br
import typingsJapgolly.stropheJs.stropheJsStrings.cite
import typingsJapgolly.stropheJs.stropheJsStrings.color
import typingsJapgolly.stropheJs.stropheJsStrings.em
import typingsJapgolly.stropheJs.stropheJsStrings.img
import typingsJapgolly.stropheJs.stropheJsStrings.li
import typingsJapgolly.stropheJs.stropheJsStrings.ol
import typingsJapgolly.stropheJs.stropheJsStrings.p
import typingsJapgolly.stropheJs.stropheJsStrings.span
import typingsJapgolly.stropheJs.stropheJsStrings.strong
import typingsJapgolly.stropheJs.stropheJsStrings.ul
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants: XHTML_IM Namespace
  *  contains allowed tags, tag attributes, and css properties.
  *  Used in the createHtml function to filter incoming html into the allowed XHTML-IM subset.
  *  See http://xmpp.org/extensions/xep-0071.html#profile-summary for the list of recommended
  *  allowed tags and their attributes.
  */
object XHTML {
  
  @JSGlobal("Strophe.XHTML")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("Strophe.XHTML.attributes")
  @js.native
  def attributes: A = js.native
  inline def attributes_=(x: A): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("attributes")(x.asInstanceOf[js.Any])
  
  @JSGlobal("Strophe.XHTML.css")
  @js.native
  def css: js.Tuple10[
    `background-color`, 
    color, 
    `font-family`, 
    `font-size`, 
    `font-style`, 
    `font-weight`, 
    `margin-left`, 
    `margin-right`, 
    `text-align`, 
    `text-decoration`
  ] = js.native
  inline def css_=(
    x: js.Tuple10[
      `background-color`, 
      color, 
      `font-family`, 
      `font-size`, 
      `font-style`, 
      `font-weight`, 
      `margin-left`, 
      `margin-right`, 
      `text-align`, 
      `text-decoration`
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("css")(x.asInstanceOf[js.Any])
  
  @JSGlobal("Strophe.XHTML.tags")
  @js.native
  def tags: js.Tuple13[a, blockquote, br, cite, em, img, li, ol, p, span, strong, ul, body] = js.native
  inline def tags_=(x: js.Tuple13[a, blockquote, br, cite, em, img, li, ol, p, span, strong, ul, body]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tags")(x.asInstanceOf[js.Any])
  
  /**
    * Function: XHTML.validAttribute
    * Utility method to determine whether an attribute is allowed as recommended per XEP-0071 for the passed tag
    *
    * @param tag XHTML tag names are case sensitive and must be lower case
    * @param attribute XHTML attribute names are case sensitive and must be lower case.
    */
  inline def validAttribute(tag: String, attribute: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validAttribute")(tag.asInstanceOf[js.Any], attribute.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Function: XHTML.validCSS
    * Utility method to determine whether an css style attribute is allowed as recommended per XEP-0071
    *
    * @param style XHTML css style attribute names are case sensitive and must be lower case in snake-case.
    */
  inline def validCSS(style: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validCSS")(style.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Function: XHTML.validTag
    * Utility method to determine whether a tag is allowed in the XHTML_IM namespace.
    *
    * @param tag XHTML tag names are case sensitive and must be lower case.
    */
  inline def validTag(tag: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validTag")(tag.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
