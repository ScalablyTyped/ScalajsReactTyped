package typingsJapgolly.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureTypeProperties extends js.Object {
  /**
    * Domains associated with the feature type. It is an object where the name of each property corresponds with the name of a field containing a domain. If a field's domain is an instance of [InheritedDomain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-InheritedDomain.html), the application will use the domain defined for the field from the layer. If the domain is an instance of [CodedValueDomain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-CodedValueDomain.html) or [RangeDomain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RangeDomain.html) then the domain is defined specifically for the given feature type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureType.html#domains)
    */
  var domains: js.UndefOr[js.Any] = js.undefined
  /**
    * The feature type identifier.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureType.html#id)
    */
  var id: js.UndefOr[Double | String] = js.undefined
  /**
    * The feature type name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureType.html#name)
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Array of [feature templates](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html) associated with the feature type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureType.html#templates)
    */
  var templates: js.UndefOr[js.Array[FeatureTemplateProperties]] = js.undefined
}

object FeatureTypeProperties {
  @scala.inline
  def apply(
    domains: js.Any = null,
    id: Double | String = null,
    name: String = null,
    templates: js.Array[FeatureTemplateProperties] = null
  ): FeatureTypeProperties = {
    val __obj = js.Dynamic.literal()
    if (domains != null) __obj.updateDynamic("domains")(domains.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (templates != null) __obj.updateDynamic("templates")(templates.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureTypeProperties]
  }
}

