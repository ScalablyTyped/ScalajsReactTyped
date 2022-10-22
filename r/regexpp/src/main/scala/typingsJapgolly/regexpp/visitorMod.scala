package typingsJapgolly.regexpp

import japgolly.scalajs.react.Callback
import typingsJapgolly.regexpp.astMod.Alternative
import typingsJapgolly.regexpp.astMod.Assertion
import typingsJapgolly.regexpp.astMod.Backreference
import typingsJapgolly.regexpp.astMod.CapturingGroup
import typingsJapgolly.regexpp.astMod.Character
import typingsJapgolly.regexpp.astMod.CharacterClass
import typingsJapgolly.regexpp.astMod.CharacterClassRange
import typingsJapgolly.regexpp.astMod.CharacterSet
import typingsJapgolly.regexpp.astMod.Flags
import typingsJapgolly.regexpp.astMod.Group
import typingsJapgolly.regexpp.astMod.Node
import typingsJapgolly.regexpp.astMod.Pattern
import typingsJapgolly.regexpp.astMod.Quantifier
import typingsJapgolly.regexpp.astMod.RegExpLiteral
import typingsJapgolly.regexpp.visitorMod.RegExpVisitor.Handlers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object visitorMod {
  
  @JSImport("regexpp/visitor", "RegExpVisitor")
  @js.native
  open class RegExpVisitor protected () extends StObject {
    def this(handlers: Handlers) = this()
    
    def visit(node: Node): Unit = js.native
  }
  object RegExpVisitor {
    
    trait Handlers extends StObject {
      
      var onAlternativeEnter: js.UndefOr[js.Function1[/* node */ Alternative, Unit]] = js.undefined
      
      var onAlternativeLeave: js.UndefOr[js.Function1[/* node */ Alternative, Unit]] = js.undefined
      
      var onAssertionEnter: js.UndefOr[js.Function1[/* node */ Assertion, Unit]] = js.undefined
      
      var onAssertionLeave: js.UndefOr[js.Function1[/* node */ Assertion, Unit]] = js.undefined
      
      var onBackreferenceEnter: js.UndefOr[js.Function1[/* node */ Backreference, Unit]] = js.undefined
      
      var onBackreferenceLeave: js.UndefOr[js.Function1[/* node */ Backreference, Unit]] = js.undefined
      
      var onCapturingGroupEnter: js.UndefOr[js.Function1[/* node */ CapturingGroup, Unit]] = js.undefined
      
      var onCapturingGroupLeave: js.UndefOr[js.Function1[/* node */ CapturingGroup, Unit]] = js.undefined
      
      var onCharacterClassEnter: js.UndefOr[js.Function1[/* node */ CharacterClass, Unit]] = js.undefined
      
      var onCharacterClassLeave: js.UndefOr[js.Function1[/* node */ CharacterClass, Unit]] = js.undefined
      
      var onCharacterClassRangeEnter: js.UndefOr[js.Function1[/* node */ CharacterClassRange, Unit]] = js.undefined
      
      var onCharacterClassRangeLeave: js.UndefOr[js.Function1[/* node */ CharacterClassRange, Unit]] = js.undefined
      
      var onCharacterEnter: js.UndefOr[js.Function1[/* node */ Character, Unit]] = js.undefined
      
      var onCharacterLeave: js.UndefOr[js.Function1[/* node */ Character, Unit]] = js.undefined
      
      var onCharacterSetEnter: js.UndefOr[js.Function1[/* node */ CharacterSet, Unit]] = js.undefined
      
      var onCharacterSetLeave: js.UndefOr[js.Function1[/* node */ CharacterSet, Unit]] = js.undefined
      
      var onFlagsEnter: js.UndefOr[js.Function1[/* node */ Flags, Unit]] = js.undefined
      
      var onFlagsLeave: js.UndefOr[js.Function1[/* node */ Flags, Unit]] = js.undefined
      
      var onGroupEnter: js.UndefOr[js.Function1[/* node */ Group, Unit]] = js.undefined
      
      var onGroupLeave: js.UndefOr[js.Function1[/* node */ Group, Unit]] = js.undefined
      
      var onPatternEnter: js.UndefOr[js.Function1[/* node */ Pattern, Unit]] = js.undefined
      
      var onPatternLeave: js.UndefOr[js.Function1[/* node */ Pattern, Unit]] = js.undefined
      
      var onQuantifierEnter: js.UndefOr[js.Function1[/* node */ Quantifier, Unit]] = js.undefined
      
      var onQuantifierLeave: js.UndefOr[js.Function1[/* node */ Quantifier, Unit]] = js.undefined
      
      var onRegExpLiteralEnter: js.UndefOr[js.Function1[/* node */ RegExpLiteral, Unit]] = js.undefined
      
      var onRegExpLiteralLeave: js.UndefOr[js.Function1[/* node */ RegExpLiteral, Unit]] = js.undefined
    }
    object Handlers {
      
      inline def apply(): Handlers = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Handlers]
      }
      
      extension [Self <: Handlers](x: Self) {
        
        inline def setOnAlternativeEnter(value: /* node */ Alternative => Callback): Self = StObject.set(x, "onAlternativeEnter", js.Any.fromFunction1((t0: /* node */ Alternative) => value(t0).runNow()))
        
        inline def setOnAlternativeEnterUndefined: Self = StObject.set(x, "onAlternativeEnter", js.undefined)
        
        inline def setOnAlternativeLeave(value: /* node */ Alternative => Callback): Self = StObject.set(x, "onAlternativeLeave", js.Any.fromFunction1((t0: /* node */ Alternative) => value(t0).runNow()))
        
        inline def setOnAlternativeLeaveUndefined: Self = StObject.set(x, "onAlternativeLeave", js.undefined)
        
        inline def setOnAssertionEnter(value: /* node */ Assertion => Callback): Self = StObject.set(x, "onAssertionEnter", js.Any.fromFunction1((t0: /* node */ Assertion) => value(t0).runNow()))
        
        inline def setOnAssertionEnterUndefined: Self = StObject.set(x, "onAssertionEnter", js.undefined)
        
        inline def setOnAssertionLeave(value: /* node */ Assertion => Callback): Self = StObject.set(x, "onAssertionLeave", js.Any.fromFunction1((t0: /* node */ Assertion) => value(t0).runNow()))
        
        inline def setOnAssertionLeaveUndefined: Self = StObject.set(x, "onAssertionLeave", js.undefined)
        
        inline def setOnBackreferenceEnter(value: /* node */ Backreference => Callback): Self = StObject.set(x, "onBackreferenceEnter", js.Any.fromFunction1((t0: /* node */ Backreference) => value(t0).runNow()))
        
        inline def setOnBackreferenceEnterUndefined: Self = StObject.set(x, "onBackreferenceEnter", js.undefined)
        
        inline def setOnBackreferenceLeave(value: /* node */ Backreference => Callback): Self = StObject.set(x, "onBackreferenceLeave", js.Any.fromFunction1((t0: /* node */ Backreference) => value(t0).runNow()))
        
        inline def setOnBackreferenceLeaveUndefined: Self = StObject.set(x, "onBackreferenceLeave", js.undefined)
        
        inline def setOnCapturingGroupEnter(value: /* node */ CapturingGroup => Callback): Self = StObject.set(x, "onCapturingGroupEnter", js.Any.fromFunction1((t0: /* node */ CapturingGroup) => value(t0).runNow()))
        
        inline def setOnCapturingGroupEnterUndefined: Self = StObject.set(x, "onCapturingGroupEnter", js.undefined)
        
        inline def setOnCapturingGroupLeave(value: /* node */ CapturingGroup => Callback): Self = StObject.set(x, "onCapturingGroupLeave", js.Any.fromFunction1((t0: /* node */ CapturingGroup) => value(t0).runNow()))
        
        inline def setOnCapturingGroupLeaveUndefined: Self = StObject.set(x, "onCapturingGroupLeave", js.undefined)
        
        inline def setOnCharacterClassEnter(value: /* node */ CharacterClass => Callback): Self = StObject.set(x, "onCharacterClassEnter", js.Any.fromFunction1((t0: /* node */ CharacterClass) => value(t0).runNow()))
        
        inline def setOnCharacterClassEnterUndefined: Self = StObject.set(x, "onCharacterClassEnter", js.undefined)
        
        inline def setOnCharacterClassLeave(value: /* node */ CharacterClass => Callback): Self = StObject.set(x, "onCharacterClassLeave", js.Any.fromFunction1((t0: /* node */ CharacterClass) => value(t0).runNow()))
        
        inline def setOnCharacterClassLeaveUndefined: Self = StObject.set(x, "onCharacterClassLeave", js.undefined)
        
        inline def setOnCharacterClassRangeEnter(value: /* node */ CharacterClassRange => Callback): Self = StObject.set(x, "onCharacterClassRangeEnter", js.Any.fromFunction1((t0: /* node */ CharacterClassRange) => value(t0).runNow()))
        
        inline def setOnCharacterClassRangeEnterUndefined: Self = StObject.set(x, "onCharacterClassRangeEnter", js.undefined)
        
        inline def setOnCharacterClassRangeLeave(value: /* node */ CharacterClassRange => Callback): Self = StObject.set(x, "onCharacterClassRangeLeave", js.Any.fromFunction1((t0: /* node */ CharacterClassRange) => value(t0).runNow()))
        
        inline def setOnCharacterClassRangeLeaveUndefined: Self = StObject.set(x, "onCharacterClassRangeLeave", js.undefined)
        
        inline def setOnCharacterEnter(value: /* node */ Character => Callback): Self = StObject.set(x, "onCharacterEnter", js.Any.fromFunction1((t0: /* node */ Character) => value(t0).runNow()))
        
        inline def setOnCharacterEnterUndefined: Self = StObject.set(x, "onCharacterEnter", js.undefined)
        
        inline def setOnCharacterLeave(value: /* node */ Character => Callback): Self = StObject.set(x, "onCharacterLeave", js.Any.fromFunction1((t0: /* node */ Character) => value(t0).runNow()))
        
        inline def setOnCharacterLeaveUndefined: Self = StObject.set(x, "onCharacterLeave", js.undefined)
        
        inline def setOnCharacterSetEnter(value: /* node */ CharacterSet => Callback): Self = StObject.set(x, "onCharacterSetEnter", js.Any.fromFunction1((t0: /* node */ CharacterSet) => value(t0).runNow()))
        
        inline def setOnCharacterSetEnterUndefined: Self = StObject.set(x, "onCharacterSetEnter", js.undefined)
        
        inline def setOnCharacterSetLeave(value: /* node */ CharacterSet => Callback): Self = StObject.set(x, "onCharacterSetLeave", js.Any.fromFunction1((t0: /* node */ CharacterSet) => value(t0).runNow()))
        
        inline def setOnCharacterSetLeaveUndefined: Self = StObject.set(x, "onCharacterSetLeave", js.undefined)
        
        inline def setOnFlagsEnter(value: /* node */ Flags => Callback): Self = StObject.set(x, "onFlagsEnter", js.Any.fromFunction1((t0: /* node */ Flags) => value(t0).runNow()))
        
        inline def setOnFlagsEnterUndefined: Self = StObject.set(x, "onFlagsEnter", js.undefined)
        
        inline def setOnFlagsLeave(value: /* node */ Flags => Callback): Self = StObject.set(x, "onFlagsLeave", js.Any.fromFunction1((t0: /* node */ Flags) => value(t0).runNow()))
        
        inline def setOnFlagsLeaveUndefined: Self = StObject.set(x, "onFlagsLeave", js.undefined)
        
        inline def setOnGroupEnter(value: /* node */ Group => Callback): Self = StObject.set(x, "onGroupEnter", js.Any.fromFunction1((t0: /* node */ Group) => value(t0).runNow()))
        
        inline def setOnGroupEnterUndefined: Self = StObject.set(x, "onGroupEnter", js.undefined)
        
        inline def setOnGroupLeave(value: /* node */ Group => Callback): Self = StObject.set(x, "onGroupLeave", js.Any.fromFunction1((t0: /* node */ Group) => value(t0).runNow()))
        
        inline def setOnGroupLeaveUndefined: Self = StObject.set(x, "onGroupLeave", js.undefined)
        
        inline def setOnPatternEnter(value: /* node */ Pattern => Callback): Self = StObject.set(x, "onPatternEnter", js.Any.fromFunction1((t0: /* node */ Pattern) => value(t0).runNow()))
        
        inline def setOnPatternEnterUndefined: Self = StObject.set(x, "onPatternEnter", js.undefined)
        
        inline def setOnPatternLeave(value: /* node */ Pattern => Callback): Self = StObject.set(x, "onPatternLeave", js.Any.fromFunction1((t0: /* node */ Pattern) => value(t0).runNow()))
        
        inline def setOnPatternLeaveUndefined: Self = StObject.set(x, "onPatternLeave", js.undefined)
        
        inline def setOnQuantifierEnter(value: /* node */ Quantifier => Callback): Self = StObject.set(x, "onQuantifierEnter", js.Any.fromFunction1((t0: /* node */ Quantifier) => value(t0).runNow()))
        
        inline def setOnQuantifierEnterUndefined: Self = StObject.set(x, "onQuantifierEnter", js.undefined)
        
        inline def setOnQuantifierLeave(value: /* node */ Quantifier => Callback): Self = StObject.set(x, "onQuantifierLeave", js.Any.fromFunction1((t0: /* node */ Quantifier) => value(t0).runNow()))
        
        inline def setOnQuantifierLeaveUndefined: Self = StObject.set(x, "onQuantifierLeave", js.undefined)
        
        inline def setOnRegExpLiteralEnter(value: /* node */ RegExpLiteral => Callback): Self = StObject.set(x, "onRegExpLiteralEnter", js.Any.fromFunction1((t0: /* node */ RegExpLiteral) => value(t0).runNow()))
        
        inline def setOnRegExpLiteralEnterUndefined: Self = StObject.set(x, "onRegExpLiteralEnter", js.undefined)
        
        inline def setOnRegExpLiteralLeave(value: /* node */ RegExpLiteral => Callback): Self = StObject.set(x, "onRegExpLiteralLeave", js.Any.fromFunction1((t0: /* node */ RegExpLiteral) => value(t0).runNow()))
        
        inline def setOnRegExpLiteralLeaveUndefined: Self = StObject.set(x, "onRegExpLiteralLeave", js.undefined)
      }
    }
  }
}
