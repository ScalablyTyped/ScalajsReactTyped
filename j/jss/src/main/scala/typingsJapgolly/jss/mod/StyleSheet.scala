package typingsJapgolly.jss.mod

import typingsJapgolly.jss.anon.PartialRuleOptions
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyleSheet[RuleName /* <: String | Double | js.Symbol */] extends StObject {
  
  def addRule(name: RuleName, style: JssStyle[Any, Unit]): Rule | Null = js.native
  def addRule(name: RuleName, style: JssStyle[Any, Unit], options: PartialRuleOptions): Rule | Null = js.native
  /**
    * Add a rule to the current stylesheet.
    * Will insert a rule also after the stylesheet has been rendered first time.
    */
  def addRule(style: JssStyle[Any, Unit]): Rule = js.native
  def addRule(style: JssStyle[Any, Unit], options: PartialRuleOptions): Rule = js.native
  
  /**
    * Create and add rules.
    * Will render also after Style Sheet was rendered the first time.
    */
  def addRules(styles: Partial[Styles[RuleName, Any, Unit]]): js.Array[Rule] = js.native
  def addRules(styles: Partial[Styles[RuleName, Any, Unit]], options: PartialRuleOptions): js.Array[Rule] = js.native
  
  /**
    * Attach renderable to the render tree.
    */
  def attach(): this.type = js.native
  
  var attached: Boolean = js.native
  
  // Gives auto-completion on the rules declared in `createStyleSheet` without
  // causing errors for rules added dynamically after creation.
  var classes: Classes[RuleName] = js.native
  
  /**
    * Delete a rule by name.
    * Returns `true`: if rule has been deleted from the DOM.
    */
  def deleteRule(name: RuleName): Boolean = js.native
  
  def deploy(): this.type = js.native
  
  /**
    * Remove renderable from render tree.
    */
  def detach(): this.type = js.native
  
  /**
    * Get a rule by name or selector.
    */
  def getRule(nameOrSelector: RuleName): Rule = js.native
  def getRule(nameOrSelector: String): Rule = js.native
  
  /**
    * Get index of a rule.
    */
  def indexOf(rule: Rule): Double = js.native
  
  def insertRule(rule: Rule): Unit = js.native
  
  var keyframes: Keyframes[String] = js.native
  
  var linked: Boolean = js.native
  
  var options: StyleSheetOptions = js.native
  
  /**
    * Replace a rule in the current stylesheet.
    */
  def replaceRule(name: RuleName, style: JssStyle[Any, Unit]): js.Tuple2[Rule | Null, Rule | Null] = js.native
  def replaceRule(name: RuleName, style: JssStyle[Any, Unit], options: PartialRuleOptions): js.Tuple2[Rule | Null, Rule | Null] = js.native
  
  def toString(options: ToCssOptions): String = js.native
  
  def update(data: js.Object): this.type = js.native
  def update(data: js.Object, options: UpdateOptions): this.type = js.native
  /**
    * Update the function values with a new data.
    */
  def update(name: String, data: js.Object): this.type = js.native
  def update(name: String, data: js.Object, options: UpdateOptions): this.type = js.native
}
