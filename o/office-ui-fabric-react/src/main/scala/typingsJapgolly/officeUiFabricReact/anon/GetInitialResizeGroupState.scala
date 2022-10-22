package typingsJapgolly.officeUiFabricReact.anon

import typingsJapgolly.officeUiFabricReact.libComponentsResizeGroupResizeGroupDotbaseMod.IResizeGroupState
import typingsJapgolly.officeUiFabricReact.libComponentsResizeGroupResizeGroupDottypesMod.IResizeGroupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInitialResizeGroupState extends StObject {
  
  def getInitialResizeGroupState(data: Any): IResizeGroupState = js.native
  
  def getNextState(
    props: IResizeGroupProps,
    currentState: IResizeGroupState,
    getElementToMeasureDimension: js.Function0[Double]
  ): js.UndefOr[IResizeGroupState] = js.native
  def getNextState(
    props: IResizeGroupProps,
    currentState: IResizeGroupState,
    getElementToMeasureDimension: js.Function0[Double],
    newContainerDimension: Double
  ): js.UndefOr[IResizeGroupState] = js.native
  
  def shouldRenderDataForMeasurement(dataToMeasure: Any): Boolean = js.native
}
