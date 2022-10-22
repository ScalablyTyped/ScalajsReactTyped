package typingsJapgolly.mobx

import typingsJapgolly.mobx.anon.SpyReportStart
import typingsJapgolly.mobx.anon.Time
import typingsJapgolly.mobx.distCoreComputedvalueMod.IComputedDidChange
import typingsJapgolly.mobx.distTypesObservablearrayMod.IArrayDidChange
import typingsJapgolly.mobx.distTypesObservablemapMod.IMapDidChange
import typingsJapgolly.mobx.distTypesObservableobjectMod.IObjectDidChange
import typingsJapgolly.mobx.distTypesObservablesetMod.ISetDidChange
import typingsJapgolly.mobx.distTypesObservablevalueMod.IBoxDidChange
import typingsJapgolly.mobx.distTypesObservablevalueMod.IValueDidChange
import typingsJapgolly.mobx.distUtilsUtilsMod.Lambda
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreSpyMod {
  
  @JSImport("mobx/dist/core/spy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isSpyEnabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSpyEnabled")().asInstanceOf[Boolean]
  
  inline def spy(listener: js.Function1[/* change */ SpyEvent, Unit]): Lambda = ^.asInstanceOf[js.Dynamic].applyDynamic("spy")(listener.asInstanceOf[js.Any]).asInstanceOf[Lambda]
  
  inline def spyReport(event: SpyEvent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("spyReport")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def spyReportEnd(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("spyReportEnd")().asInstanceOf[Unit]
  inline def spyReportEnd(change: Time): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("spyReportEnd")(change.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def spyReportStart(event: PureSpyEvent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("spyReportStart")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.mobx.anon.Arguments
    - typingsJapgolly.mobx.anon.Name
    - typingsJapgolly.mobx.anon.Type
    - typingsJapgolly.mobx.anon.Error
    - typingsJapgolly.mobx.distCoreComputedvalueMod.IComputedDidChange[scala.Any]
    - typingsJapgolly.mobx.distTypesObservableobjectMod.IObjectDidChange[scala.Any]
    - typingsJapgolly.mobx.distTypesObservablearrayMod.IArrayDidChange[scala.Any]
    - typingsJapgolly.mobx.distTypesObservablemapMod.IMapDidChange[scala.Any, scala.Any]
    - typingsJapgolly.mobx.distTypesObservablesetMod.ISetDidChange[scala.Any]
    - typingsJapgolly.mobx.distTypesObservablevalueMod.IValueDidChange[scala.Any]
    - typingsJapgolly.mobx.distTypesObservablevalueMod.IBoxDidChange[scala.Any]
    - typingsJapgolly.mobx.anon.SpyReportEnd
  */
  type PureSpyEvent = _PureSpyEvent | IComputedDidChange[Any] | IObjectDidChange[Any] | IArrayDidChange[Any] | (IMapDidChange[Any, Any]) | ISetDidChange[Any] | IValueDidChange[Any] | IBoxDidChange[Any]
  
  type SpyEvent = PureSpyEvent & SpyReportStart
  
  trait _PureSpyEvent extends StObject
  object _PureSpyEvent {
    
    inline def Arguments(arguments: js.Array[Any], name: String, `object`: Any): typingsJapgolly.mobx.anon.Arguments = {
      val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("action")
      __obj.asInstanceOf[typingsJapgolly.mobx.anon.Arguments]
    }
    
    inline def Error(error: String, message: String, name: String): typingsJapgolly.mobx.anon.Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("error")
      __obj.asInstanceOf[typingsJapgolly.mobx.anon.Error]
    }
    
    inline def Name(name: String): typingsJapgolly.mobx.anon.Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("scheduled-reaction")
      __obj.asInstanceOf[typingsJapgolly.mobx.anon.Name]
    }
    
    inline def SpyReportEnd(): typingsJapgolly.mobx.anon.SpyReportEnd = {
      val __obj = js.Dynamic.literal(spyReportEnd = true)
      __obj.updateDynamic("type")("report-end")
      __obj.asInstanceOf[typingsJapgolly.mobx.anon.SpyReportEnd]
    }
    
    inline def Type(name: String): typingsJapgolly.mobx.anon.Type = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("reaction")
      __obj.asInstanceOf[typingsJapgolly.mobx.anon.Type]
    }
  }
}
