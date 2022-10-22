package typingsJapgolly.reduxDevtoolsLogMonitor

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.base16.mod.Base16Theme
import typingsJapgolly.redux.mod.Action
import typingsJapgolly.redux.mod.Dispatch
import typingsJapgolly.reduxDevtoolsInstrument.anon.Error
import typingsJapgolly.reduxDevtoolsInstrument.mod.LiftedAction
import typingsJapgolly.reduxDevtoolsInstrument.mod.LiftedState
import typingsJapgolly.reduxDevtoolsInstrument.mod.PerformAction
import typingsJapgolly.reduxDevtoolsLogMonitor.anon.ComponentClassExternalPro
import typingsJapgolly.reduxDevtoolsLogMonitor.anon.FunctionComponentExternal
import typingsJapgolly.reduxDevtoolsLogMonitor.libActionsMod.LogMonitorAction
import typingsJapgolly.reduxDevtoolsLogMonitor.libReducersMod.LogMonitorState
import typingsJapgolly.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.apathy
import typingsJapgolly.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.ashes
import typingsJapgolly.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.atelierDune
import typingsJapgolly.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.atelierForest
import typingsJapgolly.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.atelierHeath
import typingsJapgolly.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.atelierLakeside
import typingsJapgolly.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.atelierSeaside
import typingsJapgolly.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.bespin
import typingsJapgolly.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.brewer
import typingsJapgolly.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.bright
import typingsJapgolly.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.chalk
import typingsJapgolly.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.codeschool
import typingsJapgolly.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.colors
import typingsJapgolly.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.eighties
import typingsJapgolly.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.embers
import typingsJapgolly.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.flat
import typingsJapgolly.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.google
import typingsJapgolly.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.grayscale
import typingsJapgolly.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.greenscreen
import typingsJapgolly.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.harmonic
import typingsJapgolly.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.hopscotch
import typingsJapgolly.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.isotope
import typingsJapgolly.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.marrakesh
import typingsJapgolly.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.mocha
import typingsJapgolly.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.monokai
import typingsJapgolly.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.nicinabox
import typingsJapgolly.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.ocean
import typingsJapgolly.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.paraiso
import typingsJapgolly.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.pop
import typingsJapgolly.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.railscasts
import typingsJapgolly.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.shapeshifter
import typingsJapgolly.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.solarized
import typingsJapgolly.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.summerfruit
import typingsJapgolly.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.threezerotwofour
import typingsJapgolly.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.tomorrow
import typingsJapgolly.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.tube
import typingsJapgolly.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.twilight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLogMonitorMod extends Shortcut {
  
  @JSImport("redux-devtools-log-monitor/lib/LogMonitor", JSImport.Default)
  @js.native
  val default: ComponentClassExternalPro | FunctionComponentExternal = js.native
  
  trait DefaultProps[S] extends StObject {
    
    var expandActionRoot: Boolean
    
    var expandStateRoot: Boolean
    
    var markStateDiff: Boolean
    
    var preserveScrollTop: Boolean
    
    def select(state: Any): Any
    
    var theme: pop | atelierForest | bespin | embers | tube | bright | mocha | greenscreen | grayscale | shapeshifter | harmonic | chalk | paraiso | google | isotope | atelierLakeside | twilight | eighties | nicinabox | monokai | atelierHeath | apathy | solarized | summerfruit | colors | atelierSeaside | brewer | codeschool | railscasts | threezerotwofour | atelierDune | tomorrow | ocean | marrakesh | hopscotch | flat | ashes | typingsJapgolly.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.default | Base16Theme
  }
  object DefaultProps {
    
    inline def apply[S](
      expandActionRoot: Boolean,
      expandStateRoot: Boolean,
      markStateDiff: Boolean,
      preserveScrollTop: Boolean,
      select: Any => Any,
      theme: pop | atelierForest | bespin | embers | tube | bright | mocha | greenscreen | grayscale | shapeshifter | harmonic | chalk | paraiso | google | isotope | atelierLakeside | twilight | eighties | nicinabox | monokai | atelierHeath | apathy | solarized | summerfruit | colors | atelierSeaside | brewer | codeschool | railscasts | threezerotwofour | atelierDune | tomorrow | ocean | marrakesh | hopscotch | flat | ashes | typingsJapgolly.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.default | Base16Theme
    ): DefaultProps[S] = {
      val __obj = js.Dynamic.literal(expandActionRoot = expandActionRoot.asInstanceOf[js.Any], expandStateRoot = expandStateRoot.asInstanceOf[js.Any], markStateDiff = markStateDiff.asInstanceOf[js.Any], preserveScrollTop = preserveScrollTop.asInstanceOf[js.Any], select = js.Any.fromFunction1(select), theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultProps[S]]
    }
    
    extension [Self <: DefaultProps[?], S](x: Self & DefaultProps[S]) {
      
      inline def setExpandActionRoot(value: Boolean): Self = StObject.set(x, "expandActionRoot", value.asInstanceOf[js.Any])
      
      inline def setExpandStateRoot(value: Boolean): Self = StObject.set(x, "expandStateRoot", value.asInstanceOf[js.Any])
      
      inline def setMarkStateDiff(value: Boolean): Self = StObject.set(x, "markStateDiff", value.asInstanceOf[js.Any])
      
      inline def setPreserveScrollTop(value: Boolean): Self = StObject.set(x, "preserveScrollTop", value.asInstanceOf[js.Any])
      
      inline def setSelect(value: Any => Any): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      inline def setTheme(
        value: pop | atelierForest | bespin | embers | tube | bright | mocha | greenscreen | grayscale | shapeshifter | harmonic | chalk | paraiso | google | isotope | atelierLakeside | twilight | eighties | nicinabox | monokai | atelierHeath | apathy | solarized | summerfruit | colors | atelierSeaside | brewer | codeschool | railscasts | threezerotwofour | atelierDune | tomorrow | ocean | marrakesh | hopscotch | flat | ashes | typingsJapgolly.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.default | Base16Theme
      ): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExternalProps[S, A /* <: Action[Any] */] extends StObject {
    
    var dispatch: Dispatch[LogMonitorAction | (LiftedAction[S, A, LogMonitorState])]
    
    var expandActionRoot: Boolean
    
    var expandStateRoot: Boolean
    
    var hideMainButtons: js.UndefOr[Boolean] = js.undefined
    
    var markStateDiff: Boolean
    
    var preserveScrollTop: Boolean
    
    def select(state: S): Any
    
    var theme: pop | atelierForest | bespin | embers | tube | bright | mocha | greenscreen | grayscale | shapeshifter | harmonic | chalk | paraiso | google | isotope | atelierLakeside | twilight | eighties | nicinabox | monokai | atelierHeath | apathy | solarized | summerfruit | colors | atelierSeaside | brewer | codeschool | railscasts | threezerotwofour | atelierDune | tomorrow | ocean | marrakesh | hopscotch | flat | ashes | typingsJapgolly.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.default | Base16Theme
  }
  object ExternalProps {
    
    inline def apply[S, A /* <: Action[Any] */](
      dispatch: LogMonitorAction | (LiftedAction[S, A, LogMonitorState]) => LogMonitorAction | (LiftedAction[S, A, LogMonitorState]),
      expandActionRoot: Boolean,
      expandStateRoot: Boolean,
      markStateDiff: Boolean,
      preserveScrollTop: Boolean,
      select: S => Any,
      theme: pop | atelierForest | bespin | embers | tube | bright | mocha | greenscreen | grayscale | shapeshifter | harmonic | chalk | paraiso | google | isotope | atelierLakeside | twilight | eighties | nicinabox | monokai | atelierHeath | apathy | solarized | summerfruit | colors | atelierSeaside | brewer | codeschool | railscasts | threezerotwofour | atelierDune | tomorrow | ocean | marrakesh | hopscotch | flat | ashes | typingsJapgolly.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.default | Base16Theme
    ): ExternalProps[S, A] = {
      val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch), expandActionRoot = expandActionRoot.asInstanceOf[js.Any], expandStateRoot = expandStateRoot.asInstanceOf[js.Any], markStateDiff = markStateDiff.asInstanceOf[js.Any], preserveScrollTop = preserveScrollTop.asInstanceOf[js.Any], select = js.Any.fromFunction1(select), theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExternalProps[S, A]]
    }
    
    extension [Self <: ExternalProps[?, ?], S, A /* <: Action[Any] */](x: Self & (ExternalProps[S, A])) {
      
      inline def setDispatch(
        value: LogMonitorAction | (LiftedAction[S, A, LogMonitorState]) => LogMonitorAction | (LiftedAction[S, A, LogMonitorState])
      ): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
      
      inline def setExpandActionRoot(value: Boolean): Self = StObject.set(x, "expandActionRoot", value.asInstanceOf[js.Any])
      
      inline def setExpandStateRoot(value: Boolean): Self = StObject.set(x, "expandStateRoot", value.asInstanceOf[js.Any])
      
      inline def setHideMainButtons(value: Boolean): Self = StObject.set(x, "hideMainButtons", value.asInstanceOf[js.Any])
      
      inline def setHideMainButtonsUndefined: Self = StObject.set(x, "hideMainButtons", js.undefined)
      
      inline def setMarkStateDiff(value: Boolean): Self = StObject.set(x, "markStateDiff", value.asInstanceOf[js.Any])
      
      inline def setPreserveScrollTop(value: Boolean): Self = StObject.set(x, "preserveScrollTop", value.asInstanceOf[js.Any])
      
      inline def setSelect(value: S => Any): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      inline def setTheme(
        value: pop | atelierForest | bespin | embers | tube | bright | mocha | greenscreen | grayscale | shapeshifter | harmonic | chalk | paraiso | google | isotope | atelierLakeside | twilight | eighties | nicinabox | monokai | atelierHeath | apathy | solarized | summerfruit | colors | atelierSeaside | brewer | codeschool | railscasts | threezerotwofour | atelierDune | tomorrow | ocean | marrakesh | hopscotch | flat | ashes | typingsJapgolly.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.default | Base16Theme
      ): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait LogMonitorProps[S, A /* <: Action[Any] */]
    extends StObject
       with LiftedState[S, A, LogMonitorState] {
    
    var dispatch: Dispatch[LogMonitorAction | (LiftedAction[S, A, LogMonitorState])]
    
    var expandActionRoot: Boolean
    
    var expandStateRoot: Boolean
    
    var hideMainButtons: js.UndefOr[Boolean] = js.undefined
    
    var markStateDiff: Boolean
    
    var preserveScrollTop: Boolean
    
    def select(state: S): Any
    
    var theme: pop | atelierForest | bespin | embers | tube | bright | mocha | greenscreen | grayscale | shapeshifter | harmonic | chalk | paraiso | google | isotope | atelierLakeside | twilight | eighties | nicinabox | monokai | atelierHeath | apathy | solarized | summerfruit | colors | atelierSeaside | brewer | codeschool | railscasts | threezerotwofour | atelierDune | tomorrow | ocean | marrakesh | hopscotch | flat | ashes | typingsJapgolly.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.default | Base16Theme
  }
  object LogMonitorProps {
    
    inline def apply[S, A /* <: Action[Any] */](
      actionsById: NumberDictionary[PerformAction[A]],
      committedState: S,
      computedStates: js.Array[Error[S]],
      currentStateIndex: Double,
      dispatch: LogMonitorAction | (LiftedAction[S, A, LogMonitorState]) => LogMonitorAction | (LiftedAction[S, A, LogMonitorState]),
      expandActionRoot: Boolean,
      expandStateRoot: Boolean,
      isLocked: Boolean,
      isPaused: Boolean,
      markStateDiff: Boolean,
      monitorState: LogMonitorState,
      nextActionId: Double,
      preserveScrollTop: Boolean,
      select: S => Any,
      skippedActionIds: js.Array[Double],
      stagedActionIds: js.Array[Double],
      theme: pop | atelierForest | bespin | embers | tube | bright | mocha | greenscreen | grayscale | shapeshifter | harmonic | chalk | paraiso | google | isotope | atelierLakeside | twilight | eighties | nicinabox | monokai | atelierHeath | apathy | solarized | summerfruit | colors | atelierSeaside | brewer | codeschool | railscasts | threezerotwofour | atelierDune | tomorrow | ocean | marrakesh | hopscotch | flat | ashes | typingsJapgolly.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.default | Base16Theme
    ): LogMonitorProps[S, A] = {
      val __obj = js.Dynamic.literal(actionsById = actionsById.asInstanceOf[js.Any], committedState = committedState.asInstanceOf[js.Any], computedStates = computedStates.asInstanceOf[js.Any], currentStateIndex = currentStateIndex.asInstanceOf[js.Any], dispatch = js.Any.fromFunction1(dispatch), expandActionRoot = expandActionRoot.asInstanceOf[js.Any], expandStateRoot = expandStateRoot.asInstanceOf[js.Any], isLocked = isLocked.asInstanceOf[js.Any], isPaused = isPaused.asInstanceOf[js.Any], markStateDiff = markStateDiff.asInstanceOf[js.Any], monitorState = monitorState.asInstanceOf[js.Any], nextActionId = nextActionId.asInstanceOf[js.Any], preserveScrollTop = preserveScrollTop.asInstanceOf[js.Any], select = js.Any.fromFunction1(select), skippedActionIds = skippedActionIds.asInstanceOf[js.Any], stagedActionIds = stagedActionIds.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogMonitorProps[S, A]]
    }
    
    extension [Self <: LogMonitorProps[?, ?], S, A /* <: Action[Any] */](x: Self & (LogMonitorProps[S, A])) {
      
      inline def setDispatch(
        value: LogMonitorAction | (LiftedAction[S, A, LogMonitorState]) => LogMonitorAction | (LiftedAction[S, A, LogMonitorState])
      ): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
      
      inline def setExpandActionRoot(value: Boolean): Self = StObject.set(x, "expandActionRoot", value.asInstanceOf[js.Any])
      
      inline def setExpandStateRoot(value: Boolean): Self = StObject.set(x, "expandStateRoot", value.asInstanceOf[js.Any])
      
      inline def setHideMainButtons(value: Boolean): Self = StObject.set(x, "hideMainButtons", value.asInstanceOf[js.Any])
      
      inline def setHideMainButtonsUndefined: Self = StObject.set(x, "hideMainButtons", js.undefined)
      
      inline def setMarkStateDiff(value: Boolean): Self = StObject.set(x, "markStateDiff", value.asInstanceOf[js.Any])
      
      inline def setPreserveScrollTop(value: Boolean): Self = StObject.set(x, "preserveScrollTop", value.asInstanceOf[js.Any])
      
      inline def setSelect(value: S => Any): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      inline def setTheme(
        value: pop | atelierForest | bespin | embers | tube | bright | mocha | greenscreen | grayscale | shapeshifter | harmonic | chalk | paraiso | google | isotope | atelierLakeside | twilight | eighties | nicinabox | monokai | atelierHeath | apathy | solarized | summerfruit | colors | atelierSeaside | brewer | codeschool | railscasts | threezerotwofour | atelierDune | tomorrow | ocean | marrakesh | hopscotch | flat | ashes | typingsJapgolly.reduxDevtoolsLogMonitor.reduxDevtoolsLogMonitorStrings.default | Base16Theme
      ): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ComponentClassExternalPro | FunctionComponentExternal
  
  /* This means you don't have to write `default`, but can instead just say `libLogMonitorMod.foo` */
  override def _to: ComponentClassExternalPro | FunctionComponentExternal = default
}
