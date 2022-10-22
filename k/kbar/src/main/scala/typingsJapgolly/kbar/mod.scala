package typingsJapgolly.kbar

import typingsJapgolly.kbar.anon.InputHTMLAttributesHTMLIn
import typingsJapgolly.kbar.anon.OmitActionid
import typingsJapgolly.kbar.anon.Results
import typingsJapgolly.kbar.libActionActionImplMod.ActionImplOptions
import typingsJapgolly.kbar.libActionActionInterfaceMod.ActionInterfaceOptions
import typingsJapgolly.kbar.libKbaranimatorMod.KBarAnimatorProps
import typingsJapgolly.kbar.libKbarportalMod.Props
import typingsJapgolly.kbar.libKbarresultsMod.KBarResultsProps
import typingsJapgolly.kbar.libTypesMod.Action
import typingsJapgolly.kbar.libTypesMod.IKBarContext
import typingsJapgolly.kbar.libTypesMod.KBarProviderProps
import typingsJapgolly.kbar.libTypesMod.KBarState
import typingsJapgolly.kbar.libUseKBarMod.useKBarReturnType
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.DependencyList
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("kbar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("kbar", "ActionImpl")
  @js.native
  open class ActionImpl protected ()
    extends typingsJapgolly.kbar.libActionMod.ActionImpl {
    def this(action: Action, options: ActionImplOptions) = this()
  }
  /* static members */
  object ActionImpl {
    
    @JSImport("kbar", "ActionImpl")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(action: Action, options: ActionImplOptions): typingsJapgolly.kbar.libActionActionImplMod.ActionImpl = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(action.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.kbar.libActionActionImplMod.ActionImpl]
  }
  
  @JSImport("kbar", "ActionInterface")
  @js.native
  open class ActionInterface ()
    extends typingsJapgolly.kbar.libActionMod.ActionInterface {
    def this(actions: js.Array[Action]) = this()
    def this(actions: js.Array[Action], options: ActionInterfaceOptions) = this()
    def this(actions: Unit, options: ActionInterfaceOptions) = this()
  }
  
  @JSImport("kbar", "KBAR_LISTBOX")
  @js.native
  val KBAR_LISTBOX: /* "kbar-listbox" */ String = js.native
  
  @JSImport("kbar", "KBarAnimator")
  @js.native
  val KBarAnimator: FC[PropsWithChildren[KBarAnimatorProps]] = js.native
  
  @JSImport("kbar", "KBarContext")
  @js.native
  val KBarContext: Context[IKBarContext] = js.native
  
  inline def KBarPortal(props: Props): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("KBarPortal")(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  @JSImport("kbar", "KBarPositioner")
  @js.native
  val KBarPositioner: FC[PropsWithChildren[typingsJapgolly.kbar.libKbarpositionerMod.Props]] = js.native
  
  @JSImport("kbar", "KBarProvider")
  @js.native
  val KBarProvider: FC[PropsWithChildren[KBarProviderProps]] = js.native
  
  @JSImport("kbar", "KBarResults")
  @js.native
  val KBarResults: FC[KBarResultsProps] = js.native
  
  inline def KBarSearch(props: InputHTMLAttributesHTMLIn): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("KBarSearch")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  object NO_GROUP {
    
    @JSImport("kbar", "NO_GROUP")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("kbar", "NO_GROUP.name")
    @js.native
    def name: String = js.native
    inline def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
    
    @JSImport("kbar", "NO_GROUP.priority")
    @js.native
    def priority: Double = js.native
    inline def priority_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("priority")(x.asInstanceOf[js.Any])
  }
  
  object Priority {
    
    @JSImport("kbar", "Priority")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("kbar", "Priority.HIGH")
    @js.native
    def HIGH: Double = js.native
    inline def HIGH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HIGH")(x.asInstanceOf[js.Any])
    
    @JSImport("kbar", "Priority.LOW")
    @js.native
    def LOW: Double = js.native
    inline def LOW_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOW")(x.asInstanceOf[js.Any])
    
    @JSImport("kbar", "Priority.NORMAL")
    @js.native
    def NORMAL: Double = js.native
    inline def NORMAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NORMAL")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("kbar", "VisualState")
  @js.native
  object VisualState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.kbar.libTypesMod.VisualState & String] = js.native
    
    /* "animating-in" */ val animatingIn: typingsJapgolly.kbar.libTypesMod.VisualState.animatingIn & String = js.native
    
    /* "animating-out" */ val animatingOut: typingsJapgolly.kbar.libTypesMod.VisualState.animatingOut & String = js.native
    
    /* "hidden" */ val hidden: typingsJapgolly.kbar.libTypesMod.VisualState.hidden & String = js.native
    
    /* "showing" */ val showing: typingsJapgolly.kbar.libTypesMod.VisualState.showing & String = js.native
  }
  
  inline def createAction(params: OmitActionid): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(params.asInstanceOf[js.Any]).asInstanceOf[Action]
  
  inline def getListboxItemId(id: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getListboxItemId")(id.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("kbar", "useDeepMatches")
  @js.native
  val useDeepMatches: js.Function0[Results] = js.native
  
  inline def useKBar[C](): useKBarReturnType[C] = ^.asInstanceOf[js.Dynamic].applyDynamic("useKBar")().asInstanceOf[useKBarReturnType[C]]
  inline def useKBar[C](collector: js.Function1[/* state */ KBarState, C]): useKBarReturnType[C] = ^.asInstanceOf[js.Dynamic].applyDynamic("useKBar")(collector.asInstanceOf[js.Any]).asInstanceOf[useKBarReturnType[C]]
  
  inline def useMatches(): Results = ^.asInstanceOf[js.Dynamic].applyDynamic("useMatches")().asInstanceOf[Results]
  
  inline def useRegisterActions(actions: js.Array[Action]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useRegisterActions")(actions.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useRegisterActions(actions: js.Array[Action], dependencies: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useRegisterActions")(actions.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
