package typingsJapgolly.vueTestUtils.anon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.vueTestUtils.distTypesMod.Slot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @vue/test-utils.@vue/test-utils/dist/types.SlotDictionary & {  default :@vue/test-utils.@vue/test-utils/dist/types.Slot | undefined} */
trait SlotDictionarydefaultSlot
  extends StObject
     with /* key */ StringDictionary[Slot] {
  
  var default: js.UndefOr[Slot] = js.undefined
}
object SlotDictionarydefaultSlot {
  
  inline def apply(): SlotDictionarydefaultSlot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlotDictionarydefaultSlot]
  }
  
  extension [Self <: SlotDictionarydefaultSlot](x: Self) {
    
    inline def setDefault(value: Slot): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
  }
}
