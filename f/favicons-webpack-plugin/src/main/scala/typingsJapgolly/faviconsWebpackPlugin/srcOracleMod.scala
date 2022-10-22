package typingsJapgolly.faviconsWebpackPlugin

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcOracleMod {
  
  @JSImport("favicons-webpack-plugin/src/oracle", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Oracle {
    def this(context: Any) = this()
    
    /**
      * Tries to guess the name from package.json
      */
    /* CompleteClass */
    override def guessAppName(): Any = js.native
    
    /**
      * Tries to guess the description from package.json
      */
    /* CompleteClass */
    override def guessDescription(): Any = js.native
    
    /**
      * Tries to guess the developer {name, email, url} from package.json
      */
    /* CompleteClass */
    override def guessDeveloper(): Any = js.native
    
    /**
      * Tries to guess the developer name from package.json
      */
    /* CompleteClass */
    override def guessDeveloperName(): Any = js.native
    
    /**
      * Tries to guess the developer URL from package.json
      */
    /* CompleteClass */
    override def guessDeveloperURL(): Any = js.native
    
    /**
      * Tries to guess the version from package.json
      */
    /* CompleteClass */
    override def guessVersion(): Any = js.native
    
    /* CompleteClass */
    var pkg: Any = js.native
  }
  
  trait Oracle extends StObject {
    
    /**
      * Tries to guess the name from package.json
      */
    def guessAppName(): Any
    
    /**
      * Tries to guess the description from package.json
      */
    def guessDescription(): Any
    
    /**
      * Tries to guess the developer {name, email, url} from package.json
      */
    def guessDeveloper(): Any
    
    /**
      * Tries to guess the developer name from package.json
      */
    def guessDeveloperName(): Any
    
    /**
      * Tries to guess the developer URL from package.json
      */
    def guessDeveloperURL(): Any
    
    /**
      * Tries to guess the version from package.json
      */
    def guessVersion(): Any
    
    var pkg: Any
  }
  object Oracle {
    
    inline def apply(
      guessAppName: CallbackTo[Any],
      guessDescription: CallbackTo[Any],
      guessDeveloper: CallbackTo[Any],
      guessDeveloperName: CallbackTo[Any],
      guessDeveloperURL: CallbackTo[Any],
      guessVersion: CallbackTo[Any],
      pkg: Any
    ): Oracle = {
      val __obj = js.Dynamic.literal(guessAppName = guessAppName.toJsFn, guessDescription = guessDescription.toJsFn, guessDeveloper = guessDeveloper.toJsFn, guessDeveloperName = guessDeveloperName.toJsFn, guessDeveloperURL = guessDeveloperURL.toJsFn, guessVersion = guessVersion.toJsFn, pkg = pkg.asInstanceOf[js.Any])
      __obj.asInstanceOf[Oracle]
    }
    
    extension [Self <: Oracle](x: Self) {
      
      inline def setGuessAppName(value: CallbackTo[Any]): Self = StObject.set(x, "guessAppName", value.toJsFn)
      
      inline def setGuessDescription(value: CallbackTo[Any]): Self = StObject.set(x, "guessDescription", value.toJsFn)
      
      inline def setGuessDeveloper(value: CallbackTo[Any]): Self = StObject.set(x, "guessDeveloper", value.toJsFn)
      
      inline def setGuessDeveloperName(value: CallbackTo[Any]): Self = StObject.set(x, "guessDeveloperName", value.toJsFn)
      
      inline def setGuessDeveloperURL(value: CallbackTo[Any]): Self = StObject.set(x, "guessDeveloperURL", value.toJsFn)
      
      inline def setGuessVersion(value: CallbackTo[Any]): Self = StObject.set(x, "guessVersion", value.toJsFn)
      
      inline def setPkg(value: Any): Self = StObject.set(x, "pkg", value.asInstanceOf[js.Any])
    }
  }
}
