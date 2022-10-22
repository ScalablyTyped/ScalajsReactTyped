package typingsJapgolly.popperjsCore.anon

import typingsJapgolly.popperjsCore.libEnumsMod.ModifierPhases_
import typingsJapgolly.popperjsCore.libModifiersArrowMod.Options
import typingsJapgolly.popperjsCore.libTypesMod.ModifierArguments
import typingsJapgolly.popperjsCore.libTypesMod.Obj
import typingsJapgolly.popperjsCore.libTypesMod.State
import typingsJapgolly.popperjsCore.libTypesMod.StrictModifiers
import typingsJapgolly.popperjsCore.popperjsCoreStrings.arrow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@popperjs/core.@popperjs/core/lib/modifiers/arrow.ArrowModifier> */
trait PartialArrowModifier
  extends StObject
     with StrictModifiers {
  
  var data: js.UndefOr[Obj] = js.undefined
  
  var effect: js.UndefOr[js.Function1[/* arg0 */ ModifierArguments[Options], js.Function0[Unit] | Unit]] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var fn: js.UndefOr[js.Function1[/* arg0 */ ModifierArguments[Options], State | Unit]] = js.undefined
  
  var name: js.UndefOr[arrow] = js.undefined
  
  var options: js.UndefOr[PartialOptionsElement] = js.undefined
  
  var phase: js.UndefOr[ModifierPhases_] = js.undefined
  
  var requires: js.UndefOr[js.Array[String]] = js.undefined
  
  var requiresIfExists: js.UndefOr[js.Array[String]] = js.undefined
}
object PartialArrowModifier {
  
  inline def apply(): PartialArrowModifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialArrowModifier]
  }
  
  extension [Self <: PartialArrowModifier](x: Self) {
    
    inline def setData(value: Obj): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setEffect(value: /* arg0 */ ModifierArguments[Options] => js.Function0[Unit] | Unit): Self = StObject.set(x, "effect", js.Any.fromFunction1(value))
    
    inline def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setFn(value: /* arg0 */ ModifierArguments[Options] => State | Unit): Self = StObject.set(x, "fn", js.Any.fromFunction1(value))
    
    inline def setFnUndefined: Self = StObject.set(x, "fn", js.undefined)
    
    inline def setName(value: arrow): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOptions(value: PartialOptionsElement): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setPhase(value: ModifierPhases_): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
    
    inline def setPhaseUndefined: Self = StObject.set(x, "phase", js.undefined)
    
    inline def setRequires(value: js.Array[String]): Self = StObject.set(x, "requires", value.asInstanceOf[js.Any])
    
    inline def setRequiresIfExists(value: js.Array[String]): Self = StObject.set(x, "requiresIfExists", value.asInstanceOf[js.Any])
    
    inline def setRequiresIfExistsUndefined: Self = StObject.set(x, "requiresIfExists", js.undefined)
    
    inline def setRequiresIfExistsVarargs(value: String*): Self = StObject.set(x, "requiresIfExists", js.Array(value*))
    
    inline def setRequiresUndefined: Self = StObject.set(x, "requires", js.undefined)
    
    inline def setRequiresVarargs(value: String*): Self = StObject.set(x, "requires", js.Array(value*))
  }
}
