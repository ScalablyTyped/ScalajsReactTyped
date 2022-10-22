package typingsJapgolly.awsSdk.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudWatchDimensionConfiguration extends StObject {
  
  /**
    * The default value of the dimension that is published to Amazon CloudWatch if you do not provide the value of the dimension when you send an email. The default value must:   This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).   Contain less than 256 characters.  
    */
  var DefaultDimensionValue: typingsJapgolly.awsSdk.clientsSesMod.DefaultDimensionValue
  
  /**
    * The name of an Amazon CloudWatch dimension associated with an email sending metric. The name must:   This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).   Contain less than 256 characters.  
    */
  var DimensionName: typingsJapgolly.awsSdk.clientsSesMod.DimensionName
  
  /**
    * The place where Amazon SES finds the value of a dimension to publish to Amazon CloudWatch. If you want Amazon SES to use the message tags that you specify using an X-SES-MESSAGE-TAGS header or a parameter to the SendEmail/SendRawEmail API, choose messageTag. If you want Amazon SES to use your own email headers, choose emailHeader.
    */
  var DimensionValueSource: typingsJapgolly.awsSdk.clientsSesMod.DimensionValueSource
}
object CloudWatchDimensionConfiguration {
  
  inline def apply(
    DefaultDimensionValue: DefaultDimensionValue,
    DimensionName: DimensionName,
    DimensionValueSource: DimensionValueSource
  ): CloudWatchDimensionConfiguration = {
    val __obj = js.Dynamic.literal(DefaultDimensionValue = DefaultDimensionValue.asInstanceOf[js.Any], DimensionName = DimensionName.asInstanceOf[js.Any], DimensionValueSource = DimensionValueSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWatchDimensionConfiguration]
  }
  
  extension [Self <: CloudWatchDimensionConfiguration](x: Self) {
    
    inline def setDefaultDimensionValue(value: DefaultDimensionValue): Self = StObject.set(x, "DefaultDimensionValue", value.asInstanceOf[js.Any])
    
    inline def setDimensionName(value: DimensionName): Self = StObject.set(x, "DimensionName", value.asInstanceOf[js.Any])
    
    inline def setDimensionValueSource(value: DimensionValueSource): Self = StObject.set(x, "DimensionValueSource", value.asInstanceOf[js.Any])
  }
}
