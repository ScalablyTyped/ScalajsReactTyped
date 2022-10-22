package typingsJapgolly.bucks

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.bucks.Bucks.BucksStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Bucks extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Bucks")
    @js.native
    /**
      * Create bucks object.
      */
    open class ^ ()
      extends StObject
         with typingsJapgolly.bucks.Bucks.Bucks
    
    @JSGlobal("Bucks")
    @js.native
    val ^ : BucksStatic = js.native
    
    type _To = BucksStatic
    
    /* This means you don't have to write `^`, but can instead just say `Bucks.foo` */
    override def _to: BucksStatic = ^
  }
}
