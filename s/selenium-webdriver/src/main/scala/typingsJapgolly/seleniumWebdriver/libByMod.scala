package typingsJapgolly.seleniumWebdriver

import typingsJapgolly.seleniumWebdriver.mod.Locator
import typingsJapgolly.seleniumWebdriver.mod.WebDriver
import typingsJapgolly.seleniumWebdriver.mod.WebElement
import typingsJapgolly.seleniumWebdriver.mod._Locator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libByMod {
  
  @JSImport("selenium-webdriver/lib/by", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("selenium-webdriver/lib/by", "By")
  @js.native
  open class By protected ()
    extends StObject
       with _Locator {
    /**
      * @param {string} using the name of the location strategy to use.
      * @param {string} value the value to search for.
      */
    def this(`using`: String, value: String) = this()
    
    def toObject(): js.Object = js.native
    
    var `using`: String = js.native
    
    var value: String = js.native
  }
  /* static members */
  object By {
    
    @JSImport("selenium-webdriver/lib/by", "By")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Locates elements that have a specific class name.
      *
      * @param {string} name The class name to search for.
      * @return {!By} The new locator.
      * @see http://www.w3.org/TR/2011/WD-html5-20110525/elements.html#classes
      * @see http://www.w3.org/TR/CSS2/selector.html#class-html
      */
    inline def className(name: String): By = ^.asInstanceOf[js.Dynamic].applyDynamic("className")(name.asInstanceOf[js.Any]).asInstanceOf[By]
    
    /**
      * Locates elements using a CSS selector.
      *
      * @param {string} selector The CSS selector to use.
      * @return {!By} The new locator.
      * @see http://www.w3.org/TR/CSS2/selector.html
      */
    inline def css(selector: String): By = ^.asInstanceOf[js.Dynamic].applyDynamic("css")(selector.asInstanceOf[js.Any]).asInstanceOf[By]
    
    /**
      * Locates eleemnts by the ID attribute. This locator uses the CSS selector
      * `*[id='$ID']`, _not_ `document.getElementById`.
      *
      * @param {string} id The ID to search for.
      * @return {!By} The new locator.
      */
    inline def id(id: String): By = ^.asInstanceOf[js.Dynamic].applyDynamic("id")(id.asInstanceOf[js.Any]).asInstanceOf[By]
    
    /**
      * Locates an elements by evaluating a
      * {@linkplain WebDriver#executeScript JavaScript expression}.
      * The result of this expression must be an element or list of elements.
      *
      * @param {!(string|Function)} script The script to execute.
      * @param {...*} var_args The arguments to pass to the script.
      * @return {function(!./WebDriver): !./Promise}
      *     A new JavaScript-based locator function.
      */
    inline def js_(script: String, var_args: Any*): js.Function1[/* webdriver */ WebDriver, js.Promise[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("js")(scala.List(script.asInstanceOf[js.Any]).`++`(var_args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Function1[/* webdriver */ WebDriver, js.Promise[Any]]]
    inline def js_(script: js.Function, var_args: Any*): js.Function1[/* webdriver */ WebDriver, js.Promise[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("js")(scala.List(script.asInstanceOf[js.Any]).`++`(var_args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Function1[/* webdriver */ WebDriver, js.Promise[Any]]]
    
    /**
      * Locates link elements whose
      * {@linkplain WebElement#getText visible text} matches the given
      * string.
      *
      * @param {string} text The link text to search for.
      * @return {!By} The new locator.
      */
    inline def linkText(text: String): By = ^.asInstanceOf[js.Dynamic].applyDynamic("linkText")(text.asInstanceOf[js.Any]).asInstanceOf[By]
    
    /**
      * Locates elements whose `name` attribute has the given value.
      *
      * @param {string} name The name attribute to search for.
      * @return {!By} The new locator.
      */
    inline def name(name: String): By = ^.asInstanceOf[js.Dynamic].applyDynamic("name")(name.asInstanceOf[js.Any]).asInstanceOf[By]
    
    /**
      * Locates link elements whose
      * {@linkplain WebElement#getText visible text} contains the given
      * substring.
      *
      * @param {string} text The substring to check for in a link's visible text.
      * @return {!By} The new locator.
      */
    inline def partialLinkText(text: String): By = ^.asInstanceOf[js.Dynamic].applyDynamic("partialLinkText")(text.asInstanceOf[js.Any]).asInstanceOf[By]
    
    /**
      * Locates elements with a given tag name.
      *
      * @param {string} name The tag name to search for.
      * @return {!By} The new locator.
      * @deprecated Use {@link By.css() By.css(tagName)} instead.
      */
    inline def tagName(name: String): By = ^.asInstanceOf[js.Dynamic].applyDynamic("tagName")(name.asInstanceOf[js.Any]).asInstanceOf[By]
    
    /**
      * Locates elements matching a XPath selector. Care should be taken when
      * using an XPath selector with a {@link WebElement} as WebDriver
      * will respect the context in the specified in the selector. For example,
      * given the selector `//div`, WebDriver will search from the document root
      * regardless of whether the locator was used with a WebElement.
      *
      * @param {string} xpath The XPath selector to use.
      * @return {!By} The new locator.
      * @see http://www.w3.org/TR/xpath/
      */
    inline def xpath(xpath: String): By = ^.asInstanceOf[js.Dynamic].applyDynamic("xpath")(xpath.asInstanceOf[js.Any]).asInstanceOf[By]
  }
  
  @JSImport("selenium-webdriver/lib/by", "RelativeBy")
  @js.native
  open class RelativeBy protected ()
    extends StObject
       with _Locator {
    /**
      * @param {By} findDetails
      * @param {Array<Object>} filters
      */
    def this(findDetails: By, filters: js.Array[js.Object]) = this()
    
    /**
      * Look for elements above the root element passed in
      * @param {string|WebElement} locatorOrElement
      * @return {!RelativeBy} Return this object
      */
    def above(locatorOrElement: Locator): RelativeBy = js.native
    def above(locatorOrElement: WebElement): RelativeBy = js.native
    
    /**
      * Look for elements below the root element passed in
      * @param {Locator|WebElement} locatorOrElement
      * @return {!RelativeBy} Return this object
      */
    def below(locatorOrElement: Locator): RelativeBy = js.native
    def below(locatorOrElement: WebElement): RelativeBy = js.native
    
    /**
      * Returns a marshalled version of the {@link RelativeBy}
      * @return {!Object} Object representation of a {@link WebElement}
      *     that will be used in {@link #findElements}.
      */
    def marshall(): js.Object = js.native
    
    /**
      * Look for elements near the root element passed in
      * @param {Locator|WebElement} locatorOrElement
      * @return {!RelativeBy} Return this object
      */
    def near(locatorOrElement: Locator): RelativeBy = js.native
    def near(locatorOrElement: WebElement): RelativeBy = js.native
    
    /**
      * Look for elements left the root element passed in
      * @param {Locator|WebElement} locatorOrElement
      * @return {!RelativeBy} Return this object
      */
    def toLeftOf(locatorOrElement: Locator): RelativeBy = js.native
    def toLeftOf(locatorOrElement: WebElement): RelativeBy = js.native
    
    /**
      * Look for elements right the root element passed in
      * @param {Locator|WebElement} locatorOrElement
      * @return {!RelativeBy} Return this object
      */
    def toRightOf(locatorOrElement: Locator): RelativeBy = js.native
    def toRightOf(locatorOrElement: WebElement): RelativeBy = js.native
  }
  
  inline def checkedLocator(locator: Locator): By | js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("checkedLocator")(locator.asInstanceOf[js.Any]).asInstanceOf[By | js.Function]
  
  inline def escapeCss(css: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeCss")(css.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def locateWith(by: Locator): RelativeBy = ^.asInstanceOf[js.Dynamic].applyDynamic("locateWith")(by.asInstanceOf[js.Any]).asInstanceOf[RelativeBy]
  
  inline def withTagName(tagName: By): RelativeBy = ^.asInstanceOf[js.Dynamic].applyDynamic("withTagName")(tagName.asInstanceOf[js.Any]).asInstanceOf[RelativeBy]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.seleniumWebdriver.anon.ClassName
    - typingsJapgolly.seleniumWebdriver.anon.Css
    - typingsJapgolly.seleniumWebdriver.anon.Id
    - typingsJapgolly.seleniumWebdriver.anon.Js
    - typingsJapgolly.seleniumWebdriver.anon.LinkText
    - typingsJapgolly.seleniumWebdriver.anon.NameString
    - typingsJapgolly.seleniumWebdriver.anon.PartialLinkText
    - typingsJapgolly.seleniumWebdriver.anon.TagName
    - typingsJapgolly.seleniumWebdriver.anon.Xpath
  */
  trait ByHash
    extends StObject
       with _Locator
  object ByHash {
    
    inline def ClassName(className: String): typingsJapgolly.seleniumWebdriver.anon.ClassName = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.seleniumWebdriver.anon.ClassName]
    }
    
    inline def Css(css: String): typingsJapgolly.seleniumWebdriver.anon.Css = {
      val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.seleniumWebdriver.anon.Css]
    }
    
    inline def Id(id: String): typingsJapgolly.seleniumWebdriver.anon.Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.seleniumWebdriver.anon.Id]
    }
    
    inline def Js(js_ : String): typingsJapgolly.seleniumWebdriver.anon.Js = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("js")(js_.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.seleniumWebdriver.anon.Js]
    }
    
    inline def LinkText(linkText: String): typingsJapgolly.seleniumWebdriver.anon.LinkText = {
      val __obj = js.Dynamic.literal(linkText = linkText.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.seleniumWebdriver.anon.LinkText]
    }
    
    inline def NameString(name: String): typingsJapgolly.seleniumWebdriver.anon.NameString = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.seleniumWebdriver.anon.NameString]
    }
    
    inline def PartialLinkText(partialLinkText: String): typingsJapgolly.seleniumWebdriver.anon.PartialLinkText = {
      val __obj = js.Dynamic.literal(partialLinkText = partialLinkText.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.seleniumWebdriver.anon.PartialLinkText]
    }
    
    inline def TagName(tagName: String): typingsJapgolly.seleniumWebdriver.anon.TagName = {
      val __obj = js.Dynamic.literal(tagName = tagName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.seleniumWebdriver.anon.TagName]
    }
    
    inline def Xpath(xpath: String): typingsJapgolly.seleniumWebdriver.anon.Xpath = {
      val __obj = js.Dynamic.literal(xpath = xpath.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.seleniumWebdriver.anon.Xpath]
    }
  }
}
