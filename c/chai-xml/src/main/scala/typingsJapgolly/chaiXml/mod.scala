package typingsJapgolly.chaiXml

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.chai.Chai.ChaiPlugin
import typingsJapgolly.chaiXml.mod.ChaiXml.XmlAssertion
import typingsJapgolly.chaiXml.mod.global.Chai.Assertion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("chai-xml", JSImport.Namespace)
  @js.native
  val ^ : ChaiPlugin = js.native
  
  object ChaiXml {
    
    trait XmlAssertion
      extends StObject
         with Assertion {
      
      var and: XmlAssertion
      
      var at: XmlAssertion
      
      var be: XmlAssertion
      
      var been: XmlAssertion
      
      var has: XmlAssertion
      
      var have: XmlAssertion
      
      var is: XmlAssertion
      
      var not: XmlAssertion
      
      var of: XmlAssertion
      
      var same: XmlAssertion
      
      var that: XmlAssertion
      
      var to: XmlAssertion
      
      def valid(): XmlAssertion
      
      var which: XmlAssertion
      
      var `with`: XmlAssertion
    }
    object XmlAssertion {
      
      inline def apply(
        and: XmlAssertion,
        at: XmlAssertion,
        be: XmlAssertion,
        been: XmlAssertion,
        has: XmlAssertion,
        have: XmlAssertion,
        is: XmlAssertion,
        not: XmlAssertion,
        of: XmlAssertion,
        same: XmlAssertion,
        that: XmlAssertion,
        to: XmlAssertion,
        valid: CallbackTo[XmlAssertion],
        which: XmlAssertion,
        `with`: XmlAssertion,
        xml: XmlAssertion
      ): XmlAssertion = {
        val __obj = js.Dynamic.literal(and = and.asInstanceOf[js.Any], at = at.asInstanceOf[js.Any], be = be.asInstanceOf[js.Any], been = been.asInstanceOf[js.Any], has = has.asInstanceOf[js.Any], have = have.asInstanceOf[js.Any], is = is.asInstanceOf[js.Any], not = not.asInstanceOf[js.Any], of = of.asInstanceOf[js.Any], same = same.asInstanceOf[js.Any], that = that.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], valid = valid.toJsFn, which = which.asInstanceOf[js.Any], xml = xml.asInstanceOf[js.Any])
        __obj.updateDynamic("with")(`with`.asInstanceOf[js.Any])
        __obj.asInstanceOf[XmlAssertion]
      }
      
      extension [Self <: XmlAssertion](x: Self) {
        
        inline def setAnd(value: XmlAssertion): Self = StObject.set(x, "and", value.asInstanceOf[js.Any])
        
        inline def setAt(value: XmlAssertion): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
        
        inline def setBe(value: XmlAssertion): Self = StObject.set(x, "be", value.asInstanceOf[js.Any])
        
        inline def setBeen(value: XmlAssertion): Self = StObject.set(x, "been", value.asInstanceOf[js.Any])
        
        inline def setHas(value: XmlAssertion): Self = StObject.set(x, "has", value.asInstanceOf[js.Any])
        
        inline def setHave(value: XmlAssertion): Self = StObject.set(x, "have", value.asInstanceOf[js.Any])
        
        inline def setIs(value: XmlAssertion): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
        
        inline def setNot(value: XmlAssertion): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
        
        inline def setOf(value: XmlAssertion): Self = StObject.set(x, "of", value.asInstanceOf[js.Any])
        
        inline def setSame(value: XmlAssertion): Self = StObject.set(x, "same", value.asInstanceOf[js.Any])
        
        inline def setThat(value: XmlAssertion): Self = StObject.set(x, "that", value.asInstanceOf[js.Any])
        
        inline def setTo(value: XmlAssertion): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
        
        inline def setValid(value: CallbackTo[XmlAssertion]): Self = StObject.set(x, "valid", value.toJsFn)
        
        inline def setWhich(value: XmlAssertion): Self = StObject.set(x, "which", value.asInstanceOf[js.Any])
        
        inline def setWith(value: XmlAssertion): Self = StObject.set(x, "with", value.asInstanceOf[js.Any])
      }
    }
  }
  
  type _To = ChaiPlugin
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ChaiPlugin = ^
  
  object global {
    
    object Chai {
      
      trait Assertion extends StObject {
        
        var xml: XmlAssertion
      }
      object Assertion {
        
        inline def apply(xml: XmlAssertion): Assertion = {
          val __obj = js.Dynamic.literal(xml = xml.asInstanceOf[js.Any])
          __obj.asInstanceOf[Assertion]
        }
        
        extension [Self <: Assertion](x: Self) {
          
          inline def setXml(value: XmlAssertion): Self = StObject.set(x, "xml", value.asInstanceOf[js.Any])
        }
      }
    }
  }
}
