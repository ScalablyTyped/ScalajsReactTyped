package typingsJapgolly.antvGLite.mod

import typingsJapgolly.manaSyringe.anon.PartialTokenOption
import typingsJapgolly.manaSyringe.libCoreMod.Syringe.InjectOption
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Syringe {
  
  @JSImport("@antv/g-lite", "Syringe")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@antv/g-lite", "Syringe.ClassOptionSymbol")
  @js.native
  val ClassOptionSymbol: js.Symbol = js.native
  
  @JSImport("@antv/g-lite", "Syringe.DefaultOption")
  @js.native
  val DefaultOption: InjectOption[Any] = js.native
  
  @JSImport("@antv/g-lite", "Syringe.DefinedToken")
  @js.native
  open class DefinedToken protected ()
    extends typingsJapgolly.manaSyringe.mod.Syringe.DefinedToken {
    def this(name: String) = this()
    def this(name: String, option: PartialTokenOption) = this()
  }
  
  @JSImport("@antv/g-lite", "Syringe.Lifecycle")
  @js.native
  object Lifecycle extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.manaSyringe.libCoreMod.Syringe.Lifecycle & String] = js.native
    
    /* "singleton" */ val singleton: typingsJapgolly.manaSyringe.libCoreMod.Syringe.Lifecycle.singleton & String = js.native
    
    /* "transient" */ val transient: typingsJapgolly.manaSyringe.libCoreMod.Syringe.Lifecycle.transient & String = js.native
  }
  
  /**
    * 定义注入标识，默认允许多重注入
    */
  inline def defineToken(name: String): typingsJapgolly.manaSyringe.libCoreMod.Syringe.DefinedToken = ^.asInstanceOf[js.Dynamic].applyDynamic("defineToken")(name.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.manaSyringe.libCoreMod.Syringe.DefinedToken]
  inline def defineToken(name: String, option: PartialTokenOption): typingsJapgolly.manaSyringe.libCoreMod.Syringe.DefinedToken = (^.asInstanceOf[js.Dynamic].applyDynamic("defineToken")(name.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.manaSyringe.libCoreMod.Syringe.DefinedToken]
  
  inline def isModule(): /* is mana-syringe.mana-syringe/lib/core.Syringe.Module */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isModule")().asInstanceOf[/* is mana-syringe.mana-syringe/lib/core.Syringe.Module */ Boolean]
  inline def isModule(data: Record[Any, Any]): /* is mana-syringe.mana-syringe/lib/core.Syringe.Module */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isModule")(data.asInstanceOf[js.Any]).asInstanceOf[/* is mana-syringe.mana-syringe/lib/core.Syringe.Module */ Boolean]
}
