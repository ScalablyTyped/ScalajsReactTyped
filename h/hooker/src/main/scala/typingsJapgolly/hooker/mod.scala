package typingsJapgolly.hooker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hooker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def filter(context: Any, args: js.Array[Any]): HookerFilter = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(context.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[HookerFilter]
  
  inline def hook(`object`: Any, props: String, options: IHookerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hook")(`object`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def hook(`object`: Any, props: String, prehookFunction: HookerPreHookFunction): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hook")(`object`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], prehookFunction.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def hook(`object`: Any, props: js.Array[String], options: IHookerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hook")(`object`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def hook(`object`: Any, props: js.Array[String], prehookFunction: HookerPreHookFunction): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hook")(`object`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], prehookFunction.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def orig(`object`: Any, props: String): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("orig")(`object`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  inline def orig(`object`: Any, props: js.Array[String]): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("orig")(`object`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
  inline def `override`(value: Any): HookerOverride = ^.asInstanceOf[js.Dynamic].applyDynamic("override")(value.asInstanceOf[js.Any]).asInstanceOf[HookerOverride]
  
  inline def preempt(value: Any): HookerPreempt = ^.asInstanceOf[js.Dynamic].applyDynamic("preempt")(value.asInstanceOf[js.Any]).asInstanceOf[HookerPreempt]
  
  inline def unhook(`object`: Any): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("unhook")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def unhook(`object`: Any, props: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("unhook")(`object`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def unhook(`object`: Any, props: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("unhook")(`object`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
}
