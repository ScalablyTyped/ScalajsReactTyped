package typingsJapgolly.ckeditorCkeditor5WordCount

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.ckeditorCkeditor5WordCount.anon.Characters
import typingsJapgolly.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcWordcountMod {
  
  @JSImport("@ckeditor/ckeditor5-word-count/src/wordcount", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with WordCount
  /* static members */
  object default {
    
    @JSImport("@ckeditor/ckeditor5-word-count/src/wordcount", "default.pluginName")
    @js.native
    val pluginName: typingsJapgolly.ckeditorCkeditor5WordCount.ckeditorCkeditor5WordCountStrings.WordCount = js.native
  }
  
  @js.native
  trait WordCount
    extends StObject
       with Plugin {
    
    val characters: Double = js.native
    
    def destroy(): Unit = js.native
    
    def init(): Unit = js.native
    
    val wordCountContainer: HTMLElement = js.native
    
    val words: Double = js.native
  }
  
  trait WordCountConfig extends StObject {
    
    var container: HTMLElement
    
    var displayCharacters: js.UndefOr[Boolean] = js.undefined
    
    var displayWords: js.UndefOr[Boolean] = js.undefined
    
    var onUpdate: js.UndefOr[js.Function1[/* stats */ Characters, Unit]] = js.undefined
  }
  object WordCountConfig {
    
    inline def apply(container: HTMLElement): WordCountConfig = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
      __obj.asInstanceOf[WordCountConfig]
    }
    
    extension [Self <: WordCountConfig](x: Self) {
      
      inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setDisplayCharacters(value: Boolean): Self = StObject.set(x, "displayCharacters", value.asInstanceOf[js.Any])
      
      inline def setDisplayCharactersUndefined: Self = StObject.set(x, "displayCharacters", js.undefined)
      
      inline def setDisplayWords(value: Boolean): Self = StObject.set(x, "displayWords", value.asInstanceOf[js.Any])
      
      inline def setDisplayWordsUndefined: Self = StObject.set(x, "displayWords", js.undefined)
      
      inline def setOnUpdate(value: /* stats */ Characters => Callback): Self = StObject.set(x, "onUpdate", js.Any.fromFunction1((t0: /* stats */ Characters) => value(t0).runNow()))
      
      inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
    }
  }
  
  /* augmented module */
  object ckeditorCkeditor5CoreSrcPlugincollectionAugmentingMod {
    
    trait Plugins extends StObject {
      
      var WordCount: typingsJapgolly.ckeditorCkeditor5WordCount.srcWordcountMod.WordCount
    }
    object Plugins {
      
      inline def apply(WordCount: WordCount): Plugins = {
        val __obj = js.Dynamic.literal(WordCount = WordCount.asInstanceOf[js.Any])
        __obj.asInstanceOf[Plugins]
      }
      
      extension [Self <: Plugins](x: Self) {
        
        inline def setWordCount(value: WordCount): Self = StObject.set(x, "WordCount", value.asInstanceOf[js.Any])
      }
    }
  }
}
