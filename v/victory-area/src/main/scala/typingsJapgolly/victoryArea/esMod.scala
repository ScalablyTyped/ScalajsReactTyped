package typingsJapgolly.victoryArea

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.react.mod.FC
import typingsJapgolly.victoryArea.anon.AddGlobalListener
import typingsJapgolly.victoryArea.anon.Instantiable
import typingsJapgolly.victoryArea.anon.TypeofVictoryAreaBase
import typingsJapgolly.victoryArea.esAreaMod.AreaProps
import typingsJapgolly.victoryArea.esVictoryAreaMod.VictoryAreaBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esMod {
  
  @JSImport("victory-area/es", "Area")
  @js.native
  val Area: FC[AreaProps] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("victory-area/es", "VictoryArea")
  @js.native
  open class VictoryArea protected ()
    extends StObject
       with AddGlobalListener {
    def this(props: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.EventMixinCommonProps */ Any) = this()
  }
  @JSImport("victory-area/es", "VictoryArea")
  @js.native
  val VictoryArea: Instantiable & TypeofVictoryAreaBase & Instantiable0[VictoryAreaBase] = js.native
}
