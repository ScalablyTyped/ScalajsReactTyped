package typingsJapgolly.manaSyringe

import typingsJapgolly.manaSyringe.libContributionContributionProtocolMod.Option
import typingsJapgolly.manaSyringe.libCoreMod.Syringe.Container
import typingsJapgolly.manaSyringe.libCoreMod.Syringe.Named
import typingsJapgolly.manaSyringe.libCoreMod.Syringe.Register
import typingsJapgolly.manaSyringe.libCoreMod.Syringe.Token
import typingsJapgolly.manaSyringe.mod.Syringe.DefinedToken
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libContributionMod {
  
  @JSImport("mana-syringe/lib/contribution", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object Contribution {
    
    @JSImport("mana-syringe/lib/contribution", "Contribution")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mana-syringe/lib/contribution", "Contribution.Provider")
    @js.native
    val Provider: DefinedToken = js.native
    type Provider[T /* <: Record[String, Any] */] = typingsJapgolly.manaSyringe.libContributionContributionProtocolMod.Provider[T]
    
    /* was `typeof contributionRegister` */
    inline def register(registerMethod: Register, identifier: typingsJapgolly.manaSyringe.libCoreMod.Syringe.DefinedToken): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(registerMethod.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def register(
      registerMethod: Register,
      identifier: typingsJapgolly.manaSyringe.libCoreMod.Syringe.DefinedToken,
      option: typingsJapgolly.manaSyringe.libContributionContributionProtocolMod.Option
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(registerMethod.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    type Option = typingsJapgolly.manaSyringe.libContributionContributionProtocolMod.Option
  }
  
  @JSImport("mana-syringe/lib/contribution", "DefaultContributionProvider")
  @js.native
  open class DefaultContributionProvider[T /* <: Record[String, Any] */] protected ()
    extends typingsJapgolly.manaSyringe.libContributionContributionProviderMod.DefaultContributionProvider[T] {
    def this(serviceIdentifier: Token[T], container: Container) = this()
    def this(serviceIdentifier: Token[T], container: Container, option: Option) = this()
  }
  
  @JSImport("mana-syringe/lib/contribution", "Provider")
  @js.native
  val Provider: typingsJapgolly.manaSyringe.libCoreMod.Syringe.DefinedToken = js.native
  
  inline def contrib(token: Named): js.Function3[/* target */ Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("contrib")(token.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ Any, /* targetKey */ String, /* index */ js.UndefOr[Double], Unit]]
}
