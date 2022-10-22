package typingsJapgolly.moji

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(moji: String): Moji = ^.asInstanceOf[js.Dynamic].apply(moji.asInstanceOf[js.Any]).asInstanceOf[Moji]
  
  @JSImport("moji", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addMojisyu(`type`: String, mojisyu: MojisyuRange): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addMojisyu")(`type`.asInstanceOf[js.Any], mojisyu.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addMojisyu(`type`: String, mojisyu: MojisyuRegExp): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addMojisyu")(`type`.asInstanceOf[js.Any], mojisyu.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Moji extends StObject {
    
    def convert(beforeType: Mojisyu, afterType: Mojisyu): Moji
    
    def filter(`type`: Mojisyu): Moji
    
    def reject(`type`: Mojisyu): Moji
    
    def trim(): Moji
  }
  object Moji {
    
    inline def apply(
      convert: (Mojisyu, Mojisyu) => Moji,
      filter: Mojisyu => Moji,
      reject: Mojisyu => Moji,
      trim: CallbackTo[Moji]
    ): Moji = {
      val __obj = js.Dynamic.literal(convert = js.Any.fromFunction2(convert), filter = js.Any.fromFunction1(filter), reject = js.Any.fromFunction1(reject), trim = trim.toJsFn)
      __obj.asInstanceOf[Moji]
    }
    
    extension [Self <: Moji](x: Self) {
      
      inline def setConvert(value: (Mojisyu, Mojisyu) => Moji): Self = StObject.set(x, "convert", js.Any.fromFunction2(value))
      
      inline def setFilter(value: Mojisyu => Moji): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setReject(value: Mojisyu => Moji): Self = StObject.set(x, "reject", js.Any.fromFunction1(value))
      
      inline def setTrim(value: CallbackTo[Moji]): Self = StObject.set(x, "trim", value.toJsFn)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.moji.mojiStrings.ZE
    - typingsJapgolly.moji.mojiStrings.HE
    - typingsJapgolly.moji.mojiStrings.ZS
    - typingsJapgolly.moji.mojiStrings.HS
    - typingsJapgolly.moji.mojiStrings.HG
    - typingsJapgolly.moji.mojiStrings.KK
    - typingsJapgolly.moji.mojiStrings.ZK
    - typingsJapgolly.moji.mojiStrings.HK
  */
  trait Mojisyu extends StObject
  object Mojisyu {
    
    inline def HE: typingsJapgolly.moji.mojiStrings.HE = "HE".asInstanceOf[typingsJapgolly.moji.mojiStrings.HE]
    
    inline def HG: typingsJapgolly.moji.mojiStrings.HG = "HG".asInstanceOf[typingsJapgolly.moji.mojiStrings.HG]
    
    inline def HK: typingsJapgolly.moji.mojiStrings.HK = "HK".asInstanceOf[typingsJapgolly.moji.mojiStrings.HK]
    
    inline def HS: typingsJapgolly.moji.mojiStrings.HS = "HS".asInstanceOf[typingsJapgolly.moji.mojiStrings.HS]
    
    inline def KK: typingsJapgolly.moji.mojiStrings.KK = "KK".asInstanceOf[typingsJapgolly.moji.mojiStrings.KK]
    
    inline def ZE: typingsJapgolly.moji.mojiStrings.ZE = "ZE".asInstanceOf[typingsJapgolly.moji.mojiStrings.ZE]
    
    inline def ZK: typingsJapgolly.moji.mojiStrings.ZK = "ZK".asInstanceOf[typingsJapgolly.moji.mojiStrings.ZK]
    
    inline def ZS: typingsJapgolly.moji.mojiStrings.ZS = "ZS".asInstanceOf[typingsJapgolly.moji.mojiStrings.ZS]
  }
  
  trait MojisyuRange extends StObject {
    
    var end: Double
    
    var start: Double
  }
  object MojisyuRange {
    
    inline def apply(end: Double, start: Double): MojisyuRange = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[MojisyuRange]
    }
    
    extension [Self <: MojisyuRange](x: Self) {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait MojisyuRegExp extends StObject {
    
    var list: js.Array[String]
    
    var regexp: js.RegExp
  }
  object MojisyuRegExp {
    
    inline def apply(list: js.Array[String], regexp: js.RegExp): MojisyuRegExp = {
      val __obj = js.Dynamic.literal(list = list.asInstanceOf[js.Any], regexp = regexp.asInstanceOf[js.Any])
      __obj.asInstanceOf[MojisyuRegExp]
    }
    
    extension [Self <: MojisyuRegExp](x: Self) {
      
      inline def setList(value: js.Array[String]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setListVarargs(value: String*): Self = StObject.set(x, "list", js.Array(value*))
      
      inline def setRegexp(value: js.RegExp): Self = StObject.set(x, "regexp", value.asInstanceOf[js.Any])
    }
  }
}
