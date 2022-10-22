package typingsJapgolly.svgBakerRuntime

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.svgBakerRuntime.srcSpriteDotconfigMod.SpriteConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSpriteMod {
  
  @JSImport("svg-baker-runtime/src/sprite", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Sprite {
    def this(config: SpriteConfig) = this()
    
    /**
      * Add new symbol. If symbol with the same id exists it will be replaced.
      * @return `true` - symbol was added, `false` - replaced
      */
    /* CompleteClass */
    override def add(symbol: typingsJapgolly.svgBakerRuntime.srcSymbolMod.default): Boolean = js.native
    
    /* protected */ /* CompleteClass */
    var config: SpriteConfig = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def find(id: String): typingsJapgolly.svgBakerRuntime.srcSymbolMod.default | Null = js.native
    
    /* CompleteClass */
    override def has(id: String): Boolean = js.native
    
    /**
      * Remove symbol & destroy it
      * @return `true` - symbol was found & successfully destroyed, `false` - otherwise
      */
    /* CompleteClass */
    override def remove(id: String): Boolean = js.native
    
    /* CompleteClass */
    override def stringify(): String = js.native
    
    /* protected */ /* CompleteClass */
    var symbols: js.Array[typingsJapgolly.svgBakerRuntime.srcSymbolMod.default] = js.native
  }
  
  trait Sprite extends StObject {
    
    /**
      * Add new symbol. If symbol with the same id exists it will be replaced.
      * @return `true` - symbol was added, `false` - replaced
      */
    def add(symbol: typingsJapgolly.svgBakerRuntime.srcSymbolMod.default): Boolean
    
    /* protected */ var config: SpriteConfig
    
    def destroy(): Unit
    
    def find(id: String): typingsJapgolly.svgBakerRuntime.srcSymbolMod.default | Null
    
    def has(id: String): Boolean
    
    /**
      * Remove symbol & destroy it
      * @return `true` - symbol was found & successfully destroyed, `false` - otherwise
      */
    def remove(id: String): Boolean
    
    def stringify(): String
    
    /* protected */ var symbols: js.Array[typingsJapgolly.svgBakerRuntime.srcSymbolMod.default]
  }
  object Sprite {
    
    inline def apply(
      add: typingsJapgolly.svgBakerRuntime.srcSymbolMod.default => Boolean,
      config: SpriteConfig,
      destroy: Callback,
      find: String => typingsJapgolly.svgBakerRuntime.srcSymbolMod.default | Null,
      has: String => Boolean,
      remove: String => Boolean,
      stringify: CallbackTo[String],
      symbols: js.Array[typingsJapgolly.svgBakerRuntime.srcSymbolMod.default]
    ): Sprite = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), config = config.asInstanceOf[js.Any], destroy = destroy.toJsFn, find = js.Any.fromFunction1(find), has = js.Any.fromFunction1(has), remove = js.Any.fromFunction1(remove), stringify = stringify.toJsFn, symbols = symbols.asInstanceOf[js.Any])
      __obj.asInstanceOf[Sprite]
    }
    
    extension [Self <: Sprite](x: Self) {
      
      inline def setAdd(value: typingsJapgolly.svgBakerRuntime.srcSymbolMod.default => Boolean): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      inline def setConfig(value: SpriteConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setFind(value: String => typingsJapgolly.svgBakerRuntime.srcSymbolMod.default | Null): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
      
      inline def setHas(value: String => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def setRemove(value: String => Boolean): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      inline def setStringify(value: CallbackTo[String]): Self = StObject.set(x, "stringify", value.toJsFn)
      
      inline def setSymbols(value: js.Array[typingsJapgolly.svgBakerRuntime.srcSymbolMod.default]): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
      
      inline def setSymbolsVarargs(value: typingsJapgolly.svgBakerRuntime.srcSymbolMod.default*): Self = StObject.set(x, "symbols", js.Array(value*))
    }
  }
}
