package typingsJapgolly.officeUiFabricReact.mod

import typingsJapgolly.officeUiFabricReact.libComponentsPersonaPersonaDottypesMod.IPersonaProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- scala.Any because Already inherited
- scala.AnyRef because Already inherited
- typingsJapgolly.react.mod.DeprecatedLifecycle because Already inherited
- typingsJapgolly.react.mod.NewLifecycle because Already inherited
- js.Any because Already inherited
- typingsJapgolly.react.mod.ComponentLifecycle because Already inherited
- js.Object because Already inherited
- typingsJapgolly.react.mod.Component because Already inherited
- typingsJapgolly.officeUiFabricReact.libComponentsPersonaPersonaDotbaseMod.PersonaBase because Already inherited
- typingsJapgolly.officeUiFabricReact.libComponentsPersonaMod.PersonaBase because Already inherited
- typingsJapgolly.officeUiFabricReact.libPersonaCoinMod.PersonaBase because Inheritance from two classes. Inlined  */ @JSImport("office-ui-fabric-react", "PersonaBase")
@js.native
open class PersonaBase protected ()
  extends typingsJapgolly.officeUiFabricReact.libPersonaMod.PersonaBase {
  def this(props: IPersonaProps) = this()
}
/* static members */
object PersonaBase {
  
  @JSImport("office-ui-fabric-react", "PersonaBase")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react", "PersonaBase.defaultProps")
  @js.native
  def defaultProps: IPersonaProps = js.native
  inline def defaultProps_=(x: IPersonaProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
