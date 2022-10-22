package typingsJapgolly.oakdexPokedex.mod

import typingsJapgolly.oakdexPokedex.anon.Jump
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PokemonVariation extends StObject {
  
  var abilities: js.UndefOr[js.Array[String]] = js.undefined
  
  var base_stats: js.UndefOr[StatObject] = js.undefined
  
  var condition: js.UndefOr[String] = js.undefined
  
  var height_eu: js.UndefOr[String] = js.undefined
  
  var height_us: js.UndefOr[String] = js.undefined
  
  var image_suffix: js.UndefOr[String] = js.undefined
  
  var names: Translations
  
  var pokeathlon_stats: js.UndefOr[Jump] = js.undefined
  
  var types: js.Array[String]
  
  var weight_eu: js.UndefOr[String] = js.undefined
  
  var weight_us: js.UndefOr[String] = js.undefined
}
object PokemonVariation {
  
  inline def apply(names: Translations, types: js.Array[String]): PokemonVariation = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[PokemonVariation]
  }
  
  extension [Self <: PokemonVariation](x: Self) {
    
    inline def setAbilities(value: js.Array[String]): Self = StObject.set(x, "abilities", value.asInstanceOf[js.Any])
    
    inline def setAbilitiesUndefined: Self = StObject.set(x, "abilities", js.undefined)
    
    inline def setAbilitiesVarargs(value: String*): Self = StObject.set(x, "abilities", js.Array(value*))
    
    inline def setBase_stats(value: StatObject): Self = StObject.set(x, "base_stats", value.asInstanceOf[js.Any])
    
    inline def setBase_statsUndefined: Self = StObject.set(x, "base_stats", js.undefined)
    
    inline def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setHeight_eu(value: String): Self = StObject.set(x, "height_eu", value.asInstanceOf[js.Any])
    
    inline def setHeight_euUndefined: Self = StObject.set(x, "height_eu", js.undefined)
    
    inline def setHeight_us(value: String): Self = StObject.set(x, "height_us", value.asInstanceOf[js.Any])
    
    inline def setHeight_usUndefined: Self = StObject.set(x, "height_us", js.undefined)
    
    inline def setImage_suffix(value: String): Self = StObject.set(x, "image_suffix", value.asInstanceOf[js.Any])
    
    inline def setImage_suffixUndefined: Self = StObject.set(x, "image_suffix", js.undefined)
    
    inline def setNames(value: Translations): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setPokeathlon_stats(value: Jump): Self = StObject.set(x, "pokeathlon_stats", value.asInstanceOf[js.Any])
    
    inline def setPokeathlon_statsUndefined: Self = StObject.set(x, "pokeathlon_stats", js.undefined)
    
    inline def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value*))
    
    inline def setWeight_eu(value: String): Self = StObject.set(x, "weight_eu", value.asInstanceOf[js.Any])
    
    inline def setWeight_euUndefined: Self = StObject.set(x, "weight_eu", js.undefined)
    
    inline def setWeight_us(value: String): Self = StObject.set(x, "weight_us", value.asInstanceOf[js.Any])
    
    inline def setWeight_usUndefined: Self = StObject.set(x, "weight_us", js.undefined)
  }
}
