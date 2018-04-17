import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
@ManagedBean
@RequestScoped
public class managedbean  {
      public String bagisciyim_git()
      {
           return "bagisciyim?faces-redirect=true";
      }
      public String arama_form_git()
      {
           return "arama_formu?faces-redirect=true";
      }
        public String bagis_git()
      {
           return "bagis?faces-redirect=true";
      }
              public String aranan_git()
      {
           return "aranan?faces-redirect=true";
      }
               public String giris_git()
      {
           return "giris?faces-redirect=true";
      }
}
