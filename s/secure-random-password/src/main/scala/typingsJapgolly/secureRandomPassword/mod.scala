package typingsJapgolly.secureRandomPassword

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("secure-random-password", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("secure-random-password", "consonants")
  @js.native
  val consonants: String = js.native
  
  @JSImport("secure-random-password", "copyableSymbols")
  @js.native
  val copyableSymbols: String = js.native
  
  @JSImport("secure-random-password", "digits")
  @js.native
  val digits: String = js.native
  
  @JSImport("secure-random-password", "fullSymbols")
  @js.native
  val fullSymbols: String = js.native
  
  @JSImport("secure-random-password", "lower")
  @js.native
  val lower: String = js.native
  
  inline def randomPassword(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("randomPassword")().asInstanceOf[String]
  inline def randomPassword(options: RandomPasswordOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("randomPassword")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def randomString(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("randomString")().asInstanceOf[String]
  inline def randomString(options: RandomPasswordOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("randomString")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("secure-random-password", "symbols")
  @js.native
  val symbols: String = js.native
  
  @JSImport("secure-random-password", "upper")
  @js.native
  val upper: String = js.native
  
  @JSImport("secure-random-password", "vowels")
  @js.native
  val vowels: String = js.native
  
  trait RandomPasswordCharactersSet extends StObject {
    
    var characters: String
    
    var exactly: js.UndefOr[Double] = js.undefined
  }
  object RandomPasswordCharactersSet {
    
    inline def apply(characters: String): RandomPasswordCharactersSet = {
      val __obj = js.Dynamic.literal(characters = characters.asInstanceOf[js.Any])
      __obj.asInstanceOf[RandomPasswordCharactersSet]
    }
    
    extension [Self <: RandomPasswordCharactersSet](x: Self) {
      
      inline def setCharacters(value: String): Self = StObject.set(x, "characters", value.asInstanceOf[js.Any])
      
      inline def setExactly(value: Double): Self = StObject.set(x, "exactly", value.asInstanceOf[js.Any])
      
      inline def setExactlyUndefined: Self = StObject.set(x, "exactly", js.undefined)
    }
  }
  
  trait RandomPasswordOptions extends StObject {
    
    var avoidAmbiguous: js.UndefOr[Boolean] = js.undefined
    
    var characters: js.UndefOr[
        String | RandomPasswordCharactersSet | (js.Array[RandomPasswordCharactersSet | String])
      ] = js.undefined
    
    var length: js.UndefOr[Double] = js.undefined
    
    var predicate: js.UndefOr[js.Function1[/* result */ String, Boolean]] = js.undefined
  }
  object RandomPasswordOptions {
    
    inline def apply(): RandomPasswordOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RandomPasswordOptions]
    }
    
    extension [Self <: RandomPasswordOptions](x: Self) {
      
      inline def setAvoidAmbiguous(value: Boolean): Self = StObject.set(x, "avoidAmbiguous", value.asInstanceOf[js.Any])
      
      inline def setAvoidAmbiguousUndefined: Self = StObject.set(x, "avoidAmbiguous", js.undefined)
      
      inline def setCharacters(value: String | RandomPasswordCharactersSet | (js.Array[RandomPasswordCharactersSet | String])): Self = StObject.set(x, "characters", value.asInstanceOf[js.Any])
      
      inline def setCharactersUndefined: Self = StObject.set(x, "characters", js.undefined)
      
      inline def setCharactersVarargs(value: (RandomPasswordCharactersSet | String)*): Self = StObject.set(x, "characters", js.Array(value*))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setPredicate(value: /* result */ String => Boolean): Self = StObject.set(x, "predicate", js.Any.fromFunction1(value))
      
      inline def setPredicateUndefined: Self = StObject.set(x, "predicate", js.undefined)
    }
  }
}
