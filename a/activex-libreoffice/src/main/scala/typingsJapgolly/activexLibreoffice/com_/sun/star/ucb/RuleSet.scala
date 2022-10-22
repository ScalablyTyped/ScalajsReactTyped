package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes a set of Rules.
  *
  * A {@link RuleSet} is applied to a folder. It consists of a sequence of rules. Each rule consists of a sequence of RuleTerms describing the objects to
  * which the rule should by applied and the {@link RuleAction} which should be performed on the matching objects.
  */
trait RuleSet extends StObject {
  
  /** is a flag indicating whether the rules apply to folders, too. */
  var HandleFolder: Boolean
  
  /** contains a number of rules. */
  var Rules: SafeArray[Rule]
}
object RuleSet {
  
  inline def apply(HandleFolder: Boolean, Rules: SafeArray[Rule]): RuleSet = {
    val __obj = js.Dynamic.literal(HandleFolder = HandleFolder.asInstanceOf[js.Any], Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleSet]
  }
  
  extension [Self <: RuleSet](x: Self) {
    
    inline def setHandleFolder(value: Boolean): Self = StObject.set(x, "HandleFolder", value.asInstanceOf[js.Any])
    
    inline def setRules(value: SafeArray[Rule]): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
  }
}
