package typingsJapgolly.antvG2.mod

import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.antvG2.AnonAutoSetAxis
import typingsJapgolly.antvG2.AnonBottom
import typingsJapgolly.antvG2.AnonPadding
import typingsJapgolly.antvG2.AnonX
import typingsJapgolly.antvG2.PartialChartProps
import typingsJapgolly.antvG2.antvG2Strings.animate
import typingsJapgolly.antvG2.antvG2Strings.background
import typingsJapgolly.antvG2.antvG2Strings.container
import typingsJapgolly.antvG2.antvG2Strings.data
import typingsJapgolly.antvG2.antvG2Strings.forceFit
import typingsJapgolly.antvG2.antvG2Strings.height
import typingsJapgolly.antvG2.antvG2Strings.list
import typingsJapgolly.antvG2.antvG2Strings.matrix
import typingsJapgolly.antvG2.antvG2Strings.mirror
import typingsJapgolly.antvG2.antvG2Strings.padding
import typingsJapgolly.antvG2.antvG2Strings.pixelRatio
import typingsJapgolly.antvG2.antvG2Strings.plotBackground
import typingsJapgolly.antvG2.antvG2Strings.rect
import typingsJapgolly.antvG2.antvG2Strings.theme
import typingsJapgolly.antvG2.antvG2Strings.tree
import typingsJapgolly.antvG2.antvG2Strings.width
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@antv/g2", "Chart")
@js.native
class Chart protected () extends BashView {
  def this(config: PartialChartProps) = this()
  def changeHeight(height: Double): this.type = js.native
  def changeSize(width: Double, height: Double): this.type = js.native
  def changeWidth(width: Double): this.type = js.native
  def downloadImage(name: String): String = js.native
  @JSName("facet")
  def facet_list(`type`: list, option: AnonAutoSetAxis): Unit = js.native
  @JSName("facet")
  def facet_matrix(`type`: matrix, option: AnonAutoSetAxis): Unit = js.native
  @JSName("facet")
  def facet_mirror(`type`: mirror, option: AnonAutoSetAxis): Unit = js.native
  @JSName("facet")
  def facet_rect(`type`: rect, option: AnonAutoSetAxis): Unit = js.native
  @JSName("facet")
  def facet_tree(`type`: tree, option: AnonAutoSetAxis): Unit = js.native
  def forceFit(): this.type = js.native
  def getAllGeoms(): js.Array[Geom] = js.native
  def getSnapRecords(ponit: AnonX): js.Array[Double] = js.native
  @JSName("get")
  def get_animate(prop: animate): Boolean = js.native
  @JSName("get")
  def get_background(prop: background): typingsJapgolly.antvG2.mod.Styles.background = js.native
  @JSName("get")
  def get_container(prop: container): String | HTMLDivElement = js.native
  @JSName("get")
  def get_data(prop: data): js.Object | js.Any = js.native
  @JSName("get")
  def get_forceFit(prop: forceFit): Boolean = js.native
  @JSName("get")
  def get_height(prop: height): Double = js.native
  @JSName("get")
  def get_padding(prop: padding): AnonBottom | Double | String | (js.Tuple4[Double | String, Double | String, Double | String, Double | String]) | (js.Tuple2[String, String]) = js.native
  @JSName("get")
  def get_pixelRatio(prop: pixelRatio): Double = js.native
  @JSName("get")
  def get_plotBackground(prop: plotBackground): typingsJapgolly.antvG2.mod.Styles.background = js.native
  @JSName("get")
  def get_theme(prop: theme): js.Object | String = js.native
  @JSName("get")
  def get_width(prop: width): Double = js.native
  def hideTooltip(): js.Any = js.native
  def legend(field: String, legendConfig: LegendConfig): this.type = js.native
  def legend(field: String, option: Boolean): this.type = js.native
  def legend(option: Boolean): this.type = js.native
  def legend(option: LegendConfig): this.type = js.native
  def on(eventNane: String, event: js.Any): js.Any = js.native
  def render(): Unit = js.native
  def showTooltip(ponit: AnonX): js.Any = js.native
  def toDataURL(): String = js.native
  def tooltip(tooltipConfig: Boolean): this.type = js.native
  def tooltip(tooltipConfig: TooltipConfig): this.type = js.native
  def view(): View = js.native
  def view(option: AnonPadding): View = js.native
}

