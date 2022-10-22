package typingsJapgolly.detox.mod.global.Detox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ByWebFacade extends StObject {
  
  /**
    * Find an element on the DOM tree by its CSS class
    * @param className
    * @example
    * web.element(by.web.className('a'))
    */
  def className(className: String): WebMatcher
  
  /**
    * Find an element on the DOM tree matching the given CSS selector
    * @param cssSelector
    * @example
    * web.element(by.web.cssSelector('#cssSelector'))
    */
  def cssSelector(cssSelector: String): WebMatcher
  
  /**
    * Find an <a> element on the DOM tree by its link text (href content)
    * @param linkText
    * @example
    * web.element(by.web.href('disney.com'))
    */
  def href(linkText: String): WebMatcher
  
  /**
    * Find an <a> element on the DOM tree by its partial link text (href content)
    * @param linkTextFragment
    * @example
    * web.element(by.web.hrefContains('disney'))
    */
  def hrefContains(linkTextFragment: String): WebMatcher
  
  /**
    * Find an element on the DOM tree by its id
    * @param id
    * @example
    * web.element(by.web.id('testingh1'))
    */
  def id(id: String): WebMatcher
  
  /**
    * Find an element on the DOM tree by its "name" attribute
    * @param name
    * @example
    * web.element(by.web.name('sec_input'))
    */
  def name(name: String): WebMatcher
  
  /**
    * Find an element on the DOM tree by its tag name
    * @param tag
    * @example
    * web.element(by.web.tag('mark'))
    */
  def tag(tagName: String): WebMatcher
  
  /**
    * Find an element on the DOM tree by its XPath
    * @param xpath
    * @example
    * web.element(by.web.xpath('// *[@id="testingh1-1"]'))
    */
  def xpath(xpath: String): WebMatcher
}
object ByWebFacade {
  
  inline def apply(
    className: String => WebMatcher,
    cssSelector: String => WebMatcher,
    href: String => WebMatcher,
    hrefContains: String => WebMatcher,
    id: String => WebMatcher,
    name: String => WebMatcher,
    tag: String => WebMatcher,
    xpath: String => WebMatcher
  ): ByWebFacade = {
    val __obj = js.Dynamic.literal(className = js.Any.fromFunction1(className), cssSelector = js.Any.fromFunction1(cssSelector), href = js.Any.fromFunction1(href), hrefContains = js.Any.fromFunction1(hrefContains), id = js.Any.fromFunction1(id), name = js.Any.fromFunction1(name), tag = js.Any.fromFunction1(tag), xpath = js.Any.fromFunction1(xpath))
    __obj.asInstanceOf[ByWebFacade]
  }
  
  extension [Self <: ByWebFacade](x: Self) {
    
    inline def setClassName(value: String => WebMatcher): Self = StObject.set(x, "className", js.Any.fromFunction1(value))
    
    inline def setCssSelector(value: String => WebMatcher): Self = StObject.set(x, "cssSelector", js.Any.fromFunction1(value))
    
    inline def setHref(value: String => WebMatcher): Self = StObject.set(x, "href", js.Any.fromFunction1(value))
    
    inline def setHrefContains(value: String => WebMatcher): Self = StObject.set(x, "hrefContains", js.Any.fromFunction1(value))
    
    inline def setId(value: String => WebMatcher): Self = StObject.set(x, "id", js.Any.fromFunction1(value))
    
    inline def setName(value: String => WebMatcher): Self = StObject.set(x, "name", js.Any.fromFunction1(value))
    
    inline def setTag(value: String => WebMatcher): Self = StObject.set(x, "tag", js.Any.fromFunction1(value))
    
    inline def setXpath(value: String => WebMatcher): Self = StObject.set(x, "xpath", js.Any.fromFunction1(value))
  }
}
