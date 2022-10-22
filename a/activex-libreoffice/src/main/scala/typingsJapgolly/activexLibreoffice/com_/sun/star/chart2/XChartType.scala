package typingsJapgolly.activexLibreoffice.com_.sun.star.chart2

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XChartType
  extends StObject
     with XInterface {
  
  /** A string representation of the chart type. This needs to be the service-name which can be used to create a chart type. */
  val ChartType: String
  
  /** Returns the role of the XLabeledDataSequence of which the label will be taken to identify the {@link DataSeries} in dialogs or the legend. */
  val RoleOfSequenceForSeriesLabel: String
  
  /**
    * Returns a sequence of roles that are understood by this chart type.
    *
    * All roles must be listed in the order in which they are usually parsed. This ensures that gluing sequences together and splitting them up apart again
    * results in the same structure as before.
    *
    * Note, that this does not involve optional roles, like error-bars.
    */
  val SupportedMandatoryRoles: SafeArray[String]
  
  /**
    * Returns a sequence of roles that are understood in addition to the mandatory roles (see {@link XChartType.getSupportedMandatoryRoles()} ).
    *
    * An example for an optional role are error-bars.
    */
  val SupportedOptionalRoles: SafeArray[String]
  
  /**
    * Returns a sequence with supported property mapping roles.
    *
    * An example for a property mapping role is FillColor.
    */
  val SupportedPropertyRoles: SafeArray[String]
  
  /**
    * Creates a coordinate systems that fits the chart-type with its current settings and for the given dimension.
    * @throws IllegalArgumentException This chart type cannot be displayed in the given dimension.
    */
  def createCoordinateSystem(DimensionCount: Double): XCoordinateSystem
  
  /** A string representation of the chart type. This needs to be the service-name which can be used to create a chart type. */
  def getChartType(): String
  
  /** Returns the role of the XLabeledDataSequence of which the label will be taken to identify the {@link DataSeries} in dialogs or the legend. */
  def getRoleOfSequenceForSeriesLabel(): String
  
  /**
    * Returns a sequence of roles that are understood by this chart type.
    *
    * All roles must be listed in the order in which they are usually parsed. This ensures that gluing sequences together and splitting them up apart again
    * results in the same structure as before.
    *
    * Note, that this does not involve optional roles, like error-bars.
    */
  def getSupportedMandatoryRoles(): SafeArray[String]
  
  /**
    * Returns a sequence of roles that are understood in addition to the mandatory roles (see {@link XChartType.getSupportedMandatoryRoles()} ).
    *
    * An example for an optional role are error-bars.
    */
  def getSupportedOptionalRoles(): SafeArray[String]
  
  /**
    * Returns a sequence with supported property mapping roles.
    *
    * An example for a property mapping role is FillColor.
    */
  def getSupportedPropertyRoles(): SafeArray[String]
}
object XChartType {
  
  inline def apply(
    ChartType: String,
    RoleOfSequenceForSeriesLabel: String,
    SupportedMandatoryRoles: SafeArray[String],
    SupportedOptionalRoles: SafeArray[String],
    SupportedPropertyRoles: SafeArray[String],
    acquire: Callback,
    createCoordinateSystem: Double => XCoordinateSystem,
    getChartType: CallbackTo[String],
    getRoleOfSequenceForSeriesLabel: CallbackTo[String],
    getSupportedMandatoryRoles: CallbackTo[SafeArray[String]],
    getSupportedOptionalRoles: CallbackTo[SafeArray[String]],
    getSupportedPropertyRoles: CallbackTo[SafeArray[String]],
    queryInterface: `type` => Any,
    release: Callback
  ): XChartType = {
    val __obj = js.Dynamic.literal(ChartType = ChartType.asInstanceOf[js.Any], RoleOfSequenceForSeriesLabel = RoleOfSequenceForSeriesLabel.asInstanceOf[js.Any], SupportedMandatoryRoles = SupportedMandatoryRoles.asInstanceOf[js.Any], SupportedOptionalRoles = SupportedOptionalRoles.asInstanceOf[js.Any], SupportedPropertyRoles = SupportedPropertyRoles.asInstanceOf[js.Any], acquire = acquire.toJsFn, createCoordinateSystem = js.Any.fromFunction1(createCoordinateSystem), getChartType = getChartType.toJsFn, getRoleOfSequenceForSeriesLabel = getRoleOfSequenceForSeriesLabel.toJsFn, getSupportedMandatoryRoles = getSupportedMandatoryRoles.toJsFn, getSupportedOptionalRoles = getSupportedOptionalRoles.toJsFn, getSupportedPropertyRoles = getSupportedPropertyRoles.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XChartType]
  }
  
  extension [Self <: XChartType](x: Self) {
    
    inline def setChartType(value: String): Self = StObject.set(x, "ChartType", value.asInstanceOf[js.Any])
    
    inline def setCreateCoordinateSystem(value: Double => XCoordinateSystem): Self = StObject.set(x, "createCoordinateSystem", js.Any.fromFunction1(value))
    
    inline def setGetChartType(value: CallbackTo[String]): Self = StObject.set(x, "getChartType", value.toJsFn)
    
    inline def setGetRoleOfSequenceForSeriesLabel(value: CallbackTo[String]): Self = StObject.set(x, "getRoleOfSequenceForSeriesLabel", value.toJsFn)
    
    inline def setGetSupportedMandatoryRoles(value: CallbackTo[SafeArray[String]]): Self = StObject.set(x, "getSupportedMandatoryRoles", value.toJsFn)
    
    inline def setGetSupportedOptionalRoles(value: CallbackTo[SafeArray[String]]): Self = StObject.set(x, "getSupportedOptionalRoles", value.toJsFn)
    
    inline def setGetSupportedPropertyRoles(value: CallbackTo[SafeArray[String]]): Self = StObject.set(x, "getSupportedPropertyRoles", value.toJsFn)
    
    inline def setRoleOfSequenceForSeriesLabel(value: String): Self = StObject.set(x, "RoleOfSequenceForSeriesLabel", value.asInstanceOf[js.Any])
    
    inline def setSupportedMandatoryRoles(value: SafeArray[String]): Self = StObject.set(x, "SupportedMandatoryRoles", value.asInstanceOf[js.Any])
    
    inline def setSupportedOptionalRoles(value: SafeArray[String]): Self = StObject.set(x, "SupportedOptionalRoles", value.asInstanceOf[js.Any])
    
    inline def setSupportedPropertyRoles(value: SafeArray[String]): Self = StObject.set(x, "SupportedPropertyRoles", value.asInstanceOf[js.Any])
  }
}
