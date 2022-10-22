package typingsJapgolly.chaiMoment

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.chai.Chai.ChaiPlugin
import typingsJapgolly.chaiMoment.mod.global.ChaiMoment.Granularity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("chai-moment", JSImport.Namespace)
  @js.native
  val ^ : ChaiPlugin = js.native
  
  type _To = ChaiPlugin
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ChaiPlugin = ^
  
  object global {
    
    object Chai {
      
      @js.native
      trait AssertStatic extends StObject {
        
        def afterMoment(`val`: Any, exp: Any): Unit = js.native
        def afterMoment(`val`: Any, exp: Any, granularity: Granularity): Unit = js.native
        def afterMoment(`val`: Any, exp: Any, granularity: Granularity, msg: String): Unit = js.native
        def afterMoment(`val`: Any, exp: Any, msg: String): Unit = js.native
        
        def beforeMoment(`val`: Any, exp: Any): Unit = js.native
        def beforeMoment(`val`: Any, exp: Any, granularity: Unit, msg: String): Unit = js.native
        def beforeMoment(`val`: Any, exp: Any, granularity: Granularity): Unit = js.native
        def beforeMoment(`val`: Any, exp: Any, granularity: Granularity, msg: String): Unit = js.native
        def beforeMoment(`val`: Any, exp: Any, msg: String): Unit = js.native
        
        def sameMoment(`val`: Any, exp: Any): Unit = js.native
        def sameMoment(`val`: Any, exp: Any, granularity: Unit, msg: String): Unit = js.native
        def sameMoment(`val`: Any, exp: Any, granularity: Granularity): Unit = js.native
        def sameMoment(`val`: Any, exp: Any, granularity: Granularity, msg: String): Unit = js.native
        def sameMoment(`val`: Any, exp: Any, msg: String): Unit = js.native
      }
      
      @js.native
      trait Assertion extends StObject {
        
        def afterMoment(expected: Any): Unit = js.native
        def afterMoment(expected: Any, granularity: Granularity): Unit = js.native
        
        def beforeMoment(expected: Any): Unit = js.native
        def beforeMoment(expected: Any, granularity: Granularity): Unit = js.native
        
        def sameMoment(expected: Any): Unit = js.native
        def sameMoment(expected: Any, granularity: Granularity): Unit = js.native
      }
    }
    
    object ChaiMoment {
      
      /* Rewritten from type alias, can be one of: 
        - typingsJapgolly.chaiMoment.chaiMomentStrings.year
        - typingsJapgolly.chaiMoment.chaiMomentStrings.month
        - typingsJapgolly.chaiMoment.chaiMomentStrings.week
        - typingsJapgolly.chaiMoment.chaiMomentStrings.day
        - typingsJapgolly.chaiMoment.chaiMomentStrings.hour
        - typingsJapgolly.chaiMoment.chaiMomentStrings.minute
        - typingsJapgolly.chaiMoment.chaiMomentStrings.second
      */
      trait Granularity extends StObject
      object Granularity {
        
        inline def day: typingsJapgolly.chaiMoment.chaiMomentStrings.day = "day".asInstanceOf[typingsJapgolly.chaiMoment.chaiMomentStrings.day]
        
        inline def hour: typingsJapgolly.chaiMoment.chaiMomentStrings.hour = "hour".asInstanceOf[typingsJapgolly.chaiMoment.chaiMomentStrings.hour]
        
        inline def minute: typingsJapgolly.chaiMoment.chaiMomentStrings.minute = "minute".asInstanceOf[typingsJapgolly.chaiMoment.chaiMomentStrings.minute]
        
        inline def month: typingsJapgolly.chaiMoment.chaiMomentStrings.month = "month".asInstanceOf[typingsJapgolly.chaiMoment.chaiMomentStrings.month]
        
        inline def second: typingsJapgolly.chaiMoment.chaiMomentStrings.second = "second".asInstanceOf[typingsJapgolly.chaiMoment.chaiMomentStrings.second]
        
        inline def week: typingsJapgolly.chaiMoment.chaiMomentStrings.week = "week".asInstanceOf[typingsJapgolly.chaiMoment.chaiMomentStrings.week]
        
        inline def year: typingsJapgolly.chaiMoment.chaiMomentStrings.year = "year".asInstanceOf[typingsJapgolly.chaiMoment.chaiMomentStrings.year]
      }
    }
  }
}
