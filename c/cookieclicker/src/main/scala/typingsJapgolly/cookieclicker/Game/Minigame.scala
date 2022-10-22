package typingsJapgolly.cookieclicker.Game

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Minigame extends StObject {
  
  var draw: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var effs: js.UndefOr[Effects] = js.undefined
  
  def init(div: HTMLDivElement): Unit
  
  /**
    * Ran on load, never after
    */
  def launch(): Unit
  
  def load(save: String): Unit
  
  var logic: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * The name of the minigame
    */
  var name: String
  
  var onLevel: js.UndefOr[js.Function1[/* level */ Double, Unit]] = js.undefined
  
  var onResize: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onRuinTheFun: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var parent: GameObject
  
  /**
    * @returns The save string, can't contain `;` `|` or `,`, it's recommended to not use letters
    */
  def save(): String
}
object Minigame {
  
  inline def apply(
    init: HTMLDivElement => Callback,
    launch: Callback,
    load: String => Callback,
    name: String,
    parent: GameObject,
    save: CallbackTo[String]
  ): Minigame = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction1((t0: HTMLDivElement) => init(t0).runNow()), launch = launch.toJsFn, load = js.Any.fromFunction1((t0: String) => load(t0).runNow()), name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], save = save.toJsFn)
    __obj.asInstanceOf[Minigame]
  }
  
  extension [Self <: Minigame](x: Self) {
    
    inline def setDraw(value: Callback): Self = StObject.set(x, "draw", value.toJsFn)
    
    inline def setDrawUndefined: Self = StObject.set(x, "draw", js.undefined)
    
    inline def setEffs(value: Effects): Self = StObject.set(x, "effs", value.asInstanceOf[js.Any])
    
    inline def setEffsUndefined: Self = StObject.set(x, "effs", js.undefined)
    
    inline def setInit(value: HTMLDivElement => Callback): Self = StObject.set(x, "init", js.Any.fromFunction1((t0: HTMLDivElement) => value(t0).runNow()))
    
    inline def setLaunch(value: Callback): Self = StObject.set(x, "launch", value.toJsFn)
    
    inline def setLoad(value: String => Callback): Self = StObject.set(x, "load", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setLogic(value: Callback): Self = StObject.set(x, "logic", value.toJsFn)
    
    inline def setLogicUndefined: Self = StObject.set(x, "logic", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOnLevel(value: /* level */ Double => Callback): Self = StObject.set(x, "onLevel", js.Any.fromFunction1((t0: /* level */ Double) => value(t0).runNow()))
    
    inline def setOnLevelUndefined: Self = StObject.set(x, "onLevel", js.undefined)
    
    inline def setOnResize(value: Callback): Self = StObject.set(x, "onResize", value.toJsFn)
    
    inline def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
    
    inline def setOnRuinTheFun(value: Callback): Self = StObject.set(x, "onRuinTheFun", value.toJsFn)
    
    inline def setOnRuinTheFunUndefined: Self = StObject.set(x, "onRuinTheFun", js.undefined)
    
    inline def setParent(value: GameObject): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setSave(value: CallbackTo[String]): Self = StObject.set(x, "save", value.toJsFn)
  }
}
