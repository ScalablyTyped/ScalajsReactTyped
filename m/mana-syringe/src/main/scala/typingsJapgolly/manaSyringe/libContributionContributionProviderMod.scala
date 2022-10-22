package typingsJapgolly.manaSyringe

import typingsJapgolly.manaSyringe.libContributionContributionProtocolMod.Option
import typingsJapgolly.manaSyringe.libContributionContributionProtocolMod.Provider
import typingsJapgolly.manaSyringe.libCoreMod.Syringe.Container
import typingsJapgolly.manaSyringe.libCoreMod.Syringe.Token
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libContributionContributionProviderMod {
  
  @JSImport("mana-syringe/lib/contribution/contribution-provider", "DefaultContributionProvider")
  @js.native
  open class DefaultContributionProvider[T /* <: Record[String, Any] */] protected ()
    extends StObject
       with Provider[T] {
    def this(serviceIdentifier: Token[T], container: Container) = this()
    def this(serviceIdentifier: Token[T], container: Container, option: Option) = this()
    
    /* protected */ val container: Container = js.native
    
    /* protected */ var option: Option = js.native
    
    /* protected */ val serviceIdentifier: Token[T] = js.native
    
    /* protected */ var services: js.UndefOr[js.Array[T]] = js.native
    
    /* protected */ def setServices(recursive: Boolean): js.Array[T] = js.native
  }
}
