package typingsJapgolly.chance

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.chance.Chance.ChanceStatic
import typingsJapgolly.chance.Chance.Seed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("chance", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with typingsJapgolly.chance.Chance.Chance {
    def this(generator: js.Function0[Any]) = this()
    def this(seed: Seed*) = this()
    
    /* CompleteClass */
    var seed: Seed = js.native
  }
  @JSImport("chance", JSImport.Namespace)
  @js.native
  val ^ : ExportedChance = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("chance", "Chance")
  @js.native
  open class Chance ()
    extends StObject
       with typingsJapgolly.chance.Chance.Chance {
    def this(generator: js.Function0[Any]) = this()
    def this(seed: Seed*) = this()
    
    /* CompleteClass */
    var seed: Seed = js.native
  }
  
  @js.native
  trait ExportedChance
    extends StObject
       with ChanceStatic {
    
    def Chance(): typingsJapgolly.chance.Chance.Chance = js.native
    def Chance(generator: js.Function0[Any]): typingsJapgolly.chance.Chance.Chance = js.native
    def Chance(seed: Seed*): typingsJapgolly.chance.Chance.Chance = js.native
    @JSName("Chance")
    var Chance_Original: ExportedChance = js.native
  }
  
  type _To = ExportedChance
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ExportedChance = ^
}
