package typingsJapgolly.hyperFunctionComponent

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Changed extends StObject {
    
    def changed(props: HfcProps): Unit
    
    def disconnected(): Unit
  }
  object Changed {
    
    inline def apply(changed: HfcProps => Callback, disconnected: Callback): Changed = {
      val __obj = js.Dynamic.literal(changed = js.Any.fromFunction1((t0: HfcProps) => changed(t0).runNow()), disconnected = disconnected.toJsFn)
      __obj.asInstanceOf[Changed]
    }
    
    extension [Self <: Changed](x: Self) {
      
      inline def setChanged(value: HfcProps => Callback): Self = StObject.set(x, "changed", js.Any.fromFunction1((t0: HfcProps) => value(t0).runNow()))
      
      inline def setDisconnected(value: Callback): Self = StObject.set(x, "disconnected", value.toJsFn)
    }
  }
  
  trait Dictk
    extends StObject
       with /* k */ StringDictionary[Any] {
    
    var key: js.UndefOr[String] = js.undefined
  }
  object Dictk {
    
    inline def apply(): Dictk = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictk]
    }
    
    extension [Self <: Dictk](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
  
  trait Hfc extends StObject {
    
    var hfc: String
    
    // [AttrNames, EventNames, SlotNames]
    var names: js.Tuple3[js.Array[String], js.Array[String], js.Array[String]]
    
    var tag: String
    
    var ver: String
  }
  object Hfc {
    
    inline def apply(
      hfc: String,
      names: js.Tuple3[js.Array[String], js.Array[String], js.Array[String]],
      tag: String,
      ver: String
    ): Hfc = {
      val __obj = js.Dynamic.literal(hfc = hfc.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], ver = ver.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hfc]
    }
    
    extension [Self <: Hfc](x: Self) {
      
      inline def setHfc(value: String): Self = StObject.set(x, "hfc", value.asInstanceOf[js.Any])
      
      inline def setNames(value: js.Tuple3[js.Array[String], js.Array[String], js.Array[String]]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setVer(value: String): Self = StObject.set(x, "ver", value.asInstanceOf[js.Any])
    }
  }
}
