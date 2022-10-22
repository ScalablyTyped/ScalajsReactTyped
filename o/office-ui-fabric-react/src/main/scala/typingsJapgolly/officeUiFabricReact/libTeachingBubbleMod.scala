package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.anon.CalloutProps
import typingsJapgolly.officeUiFabricReact.libComponentsTeachingBubbleTeachingBubbleDottypesMod.ITeachingBubbleProps
import typingsJapgolly.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTeachingBubbleMod {
  
  @JSImport("office-ui-fabric-react/lib/TeachingBubble", "TeachingBubble")
  @js.native
  val TeachingBubble: FunctionComponent[ITeachingBubbleProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/TeachingBubble", "TeachingBubbleBase")
  @js.native
  open class TeachingBubbleBase protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsTeachingBubbleMod.TeachingBubbleBase {
    def this(props: ITeachingBubbleProps) = this()
  }
  /* static members */
  object TeachingBubbleBase {
    
    @JSImport("office-ui-fabric-react/lib/TeachingBubble", "TeachingBubbleBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/TeachingBubble", "TeachingBubbleBase.defaultProps")
    @js.native
    def defaultProps: CalloutProps = js.native
    inline def defaultProps_=(x: CalloutProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/TeachingBubble", "TeachingBubbleContent")
  @js.native
  val TeachingBubbleContent: FunctionComponent[ITeachingBubbleProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/TeachingBubble", "TeachingBubbleContentBase")
  @js.native
  open class TeachingBubbleContentBase protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsTeachingBubbleMod.TeachingBubbleContentBase {
    def this(props: ITeachingBubbleProps) = this()
  }
}
