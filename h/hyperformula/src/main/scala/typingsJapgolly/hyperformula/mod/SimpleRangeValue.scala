package typingsJapgolly.hyperformula.mod

import typingsJapgolly.hyperformula.typingsAbsoluteCellRangeMod.AbsoluteCellRange
import typingsJapgolly.hyperformula.typingsDependencyGraphMod.DependencyGraph
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterValueMod.InternalScalarValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hyperformula", "SimpleRangeValue")
@js.native
open class SimpleRangeValue ()
  extends typingsJapgolly.hyperformula.typingsInterpreterSimpleRangeValueMod.SimpleRangeValue {
  def this(_data: js.Array[js.Array[InternalScalarValue]]) = this()
  def this(_data: js.Array[js.Array[InternalScalarValue]], range: AbsoluteCellRange) = this()
  def this(_data: Unit, range: AbsoluteCellRange) = this()
  def this(_data: js.Array[js.Array[InternalScalarValue]], range: Unit, dependencyGraph: DependencyGraph) = this()
  def this(
    _data: js.Array[js.Array[InternalScalarValue]],
    range: AbsoluteCellRange,
    dependencyGraph: DependencyGraph
  ) = this()
  def this(_data: Unit, range: Unit, dependencyGraph: DependencyGraph) = this()
  def this(_data: Unit, range: AbsoluteCellRange, dependencyGraph: DependencyGraph) = this()
  def this(
    _data: js.Array[js.Array[InternalScalarValue]],
    range: Unit,
    dependencyGraph: Unit,
    _hasOnlyNumbers: Boolean
  ) = this()
  def this(
    _data: js.Array[js.Array[InternalScalarValue]],
    range: Unit,
    dependencyGraph: DependencyGraph,
    _hasOnlyNumbers: Boolean
  ) = this()
  def this(
    _data: js.Array[js.Array[InternalScalarValue]],
    range: AbsoluteCellRange,
    dependencyGraph: Unit,
    _hasOnlyNumbers: Boolean
  ) = this()
  def this(
    _data: js.Array[js.Array[InternalScalarValue]],
    range: AbsoluteCellRange,
    dependencyGraph: DependencyGraph,
    _hasOnlyNumbers: Boolean
  ) = this()
  def this(_data: Unit, range: Unit, dependencyGraph: Unit, _hasOnlyNumbers: Boolean) = this()
  def this(_data: Unit, range: Unit, dependencyGraph: DependencyGraph, _hasOnlyNumbers: Boolean) = this()
  def this(_data: Unit, range: AbsoluteCellRange, dependencyGraph: Unit, _hasOnlyNumbers: Boolean) = this()
  def this(_data: Unit, range: AbsoluteCellRange, dependencyGraph: DependencyGraph, _hasOnlyNumbers: Boolean) = this()
}
/* static members */
object SimpleRangeValue {
  
  @JSImport("hyperformula", "SimpleRangeValue")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromRange(
    data: js.Array[js.Array[InternalScalarValue]],
    range: AbsoluteCellRange,
    dependencyGraph: DependencyGraph
  ): typingsJapgolly.hyperformula.typingsInterpreterSimpleRangeValueMod.SimpleRangeValue = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRange")(data.asInstanceOf[js.Any], range.asInstanceOf[js.Any], dependencyGraph.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.hyperformula.typingsInterpreterSimpleRangeValueMod.SimpleRangeValue]
  
  inline def fromScalar(scalar: InternalScalarValue): typingsJapgolly.hyperformula.typingsInterpreterSimpleRangeValueMod.SimpleRangeValue = ^.asInstanceOf[js.Dynamic].applyDynamic("fromScalar")(scalar.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.hyperformula.typingsInterpreterSimpleRangeValueMod.SimpleRangeValue]
  
  inline def onlyNumbers(data: js.Array[js.Array[Double]]): typingsJapgolly.hyperformula.typingsInterpreterSimpleRangeValueMod.SimpleRangeValue = ^.asInstanceOf[js.Dynamic].applyDynamic("onlyNumbers")(data.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.hyperformula.typingsInterpreterSimpleRangeValueMod.SimpleRangeValue]
  
  inline def onlyRange(range: AbsoluteCellRange, dependencyGraph: DependencyGraph): typingsJapgolly.hyperformula.typingsInterpreterSimpleRangeValueMod.SimpleRangeValue = (^.asInstanceOf[js.Dynamic].applyDynamic("onlyRange")(range.asInstanceOf[js.Any], dependencyGraph.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.hyperformula.typingsInterpreterSimpleRangeValueMod.SimpleRangeValue]
  
  inline def onlyValues(data: js.Array[js.Array[InternalScalarValue]]): typingsJapgolly.hyperformula.typingsInterpreterSimpleRangeValueMod.SimpleRangeValue = ^.asInstanceOf[js.Dynamic].applyDynamic("onlyValues")(data.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.hyperformula.typingsInterpreterSimpleRangeValueMod.SimpleRangeValue]
}
