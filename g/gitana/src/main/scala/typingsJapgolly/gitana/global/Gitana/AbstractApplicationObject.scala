package typingsJapgolly.gitana.global.Gitana

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Gitana.AbstractApplicationObject")
@js.native
open class AbstractApplicationObject protected ()
  extends typingsJapgolly.gitana.mod.AbstractApplicationObject {
  def this(application: Any, `object`: Any) = this()
}
object AbstractApplicationObject {
  
  @JSGlobal("Gitana.AbstractApplicationObject")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(_instance: Any, _static: Any, args: Any*): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")((scala.List(_instance.asInstanceOf[js.Any], _static.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]
  
  /* static member */
  inline def forEach(`object`: Any, block: Any, context: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(`object`.asInstanceOf[js.Any], block.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def implement(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("implement")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  /* static member */
  inline def toString_(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")().asInstanceOf[String]
  
  /* static member */
  inline def valueOf_(`type`: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("valueOf")(`type`.asInstanceOf[js.Any]).asInstanceOf[Any]
}
