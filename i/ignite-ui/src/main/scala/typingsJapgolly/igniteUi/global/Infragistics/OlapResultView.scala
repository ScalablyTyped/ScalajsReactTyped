package typingsJapgolly.igniteUi.global.Infragistics

import typingsJapgolly.igniteUi.OlapResultViewOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Infragistics.OlapResultView")
@js.native
open class OlapResultView protected ()
  extends StObject
     with typingsJapgolly.igniteUi.Infragistics.OlapResultView {
  def this(options: OlapResultViewOptions) = this()
  
  /**
    * Creates a new $.ig.OlapResultView object with result object having the same structure as the original one and new visibleResult where the tuples which appear as children under specified tuple and member index are no longer present.
    *
    * @param axisName
    * @param tupleIndex
    * @param memberIndex
    */
  /* CompleteClass */
  override def collapseTupleMember(axisName: js.Object, tupleIndex: js.Object, memberIndex: js.Object): js.Object = js.native
  
  /**
    * Creates a $.ig.OlapResultView view object with result object having the same structure as the original one and new visibleResult where the tuples which appear as children under specified tuple and member index are accessible as part of the visibleResult.
    *
    * @param axisName
    * @param tupleIndex
    * @param memberIndex
    */
  /* CompleteClass */
  override def expandTupleMember(axisName: js.Object, tupleIndex: js.Object, memberIndex: js.Object): js.Object = js.native
  
  /**
    * Creates a new $.ig.OlapResultView object as the axis specified by axisName of the original result object is extended with the tuples of the same axis found into supplied partialResult object.
    *
    * @param partialResult
    * @param axisName
    */
  /* CompleteClass */
  override def extend(partialResult: js.Object, axisName: js.Object): js.Object = js.native
}
